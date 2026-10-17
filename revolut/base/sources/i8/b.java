package i8;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import androidx.core.util.Pools$Pool;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f159345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f159346c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f159344a = i;
        this.f159345b = obj2;
        this.f159346c = obj3;
    }

    @Override // i8.u
    public final t a(Object obj2, int i, int i2, c8.k kVar) {
        com.bumptech.glide.load.data.l lVar;
        t tVarA;
        Uri uri2;
        switch (this.f159344a) {
            case 0:
                Uri uri3 = (Uri) obj2;
                String strSubstring = uri3.toString().substring(22);
                x8.e eVar = new x8.e(uri3);
                AssetManager assetManager = (AssetManager) this.f159345b;
                switch (((a) this.f159346c).f159339a) {
                    case 0:
                        lVar = new com.bumptech.glide.load.data.l(assetManager, strSubstring, 0);
                        break;
                    default:
                        lVar = new com.bumptech.glide.load.data.l(assetManager, strSubstring, 1);
                        break;
                }
                return new t(eVar, lVar);
            case 1:
                ArrayList arrayList = (ArrayList) this.f159345b;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                c8.g gVar = null;
                for (int i3 = 0; i3 < size; i3++) {
                    u uVar = (u) arrayList.get(i3);
                    if (uVar.b(obj2) && (tVarA = uVar.a(obj2, i, i2, kVar)) != null) {
                        gVar = tVarA.f159398a;
                        arrayList2.add(tVarA.f159400c);
                    }
                }
                if (arrayList2.isEmpty() || gVar == null) {
                    return null;
                }
                return new t(gVar, new y(arrayList2, (Pools$Pool) this.f159346c));
            default:
                Integer num = (Integer) obj2;
                Resources resources = (Resources) this.f159346c;
                try {
                    uri2 = Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + '/' + resources.getResourceTypeName(num.intValue()) + '/' + resources.getResourceEntryName(num.intValue()));
                    break;
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        String str = "Received invalid resource id: " + num;
                    }
                    uri2 = null;
                }
                if (uri2 == null) {
                    return null;
                }
                return ((u) this.f159345b).a(uri2, i, i2, kVar);
        }
    }

    @Override // i8.u
    public final boolean b(Object obj2) {
        switch (this.f159344a) {
            case 0:
                Uri uri2 = (Uri) obj2;
                return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
            case 1:
                Iterator it8 = ((ArrayList) this.f159345b).iterator();
                while (it8.hasNext()) {
                    if (((u) it8.next()).b(obj2)) {
                        return true;
                    }
                }
                return false;
            default:
                return true;
        }
    }

    public String toString() {
        switch (this.f159344a) {
            case 1:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f159345b).toArray()) + CoreConstants.CURLY_RIGHT;
            default:
                return super.toString();
        }
    }

    public b(Resources resources, u uVar) {
        this.f159344a = 2;
        this.f159346c = resources;
        this.f159345b = uVar;
    }
}
