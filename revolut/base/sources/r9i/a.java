package r9i;

import android.net.Uri;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;
import zx0.i;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    @NotNull
    public static final C1394a Companion = new C1394a();

    /* JADX INFO: renamed from: r9i.a$a, reason: collision with other inner class name */
    public static final class C1394a {
        private C1394a() {
        }
    }

    public static String a(i9i.a aVar) {
        String string = Uri.parse(aVar.f159875a).buildUpon().appendQueryParameter("revolut_h", String.valueOf(aVar.f159877c)).appendQueryParameter("revolut_w", String.valueOf(aVar.f159876b)).build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static ArrayList b(i9i.d result) {
        Object aVar;
        Intrinsics.checkNotNullParameter(result, "result");
        ArrayList<i9i.c> arrayList = result.f159881a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (i9i.c cVar : arrayList) {
            i9i.b bVar = cVar.e;
            String str = cVar.f159878a;
            i9i.a aVar2 = cVar.f159879b;
            int i = b.f252730a[bVar.ordinal()];
            if (i == 1) {
                aVar = new h9i.a(a(aVar2), str);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new h9i.b(a(aVar2), str);
            }
            Object obj2 = aVar;
            boolean z = cVar.e == i9i.b.STICKER;
            arrayList2.add(new i(new UrlImage(aVar2.f159875a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), aVar2.f159876b, aVar2.f159877c, z, z, j6.a.q("ITEM_", str), obj2));
        }
        return arrayList2;
    }
}
