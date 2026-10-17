package d8;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.e;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparable f112093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f112094c;
    public Object d;

    public /* synthetic */ b(int i, Comparable comparable, Object obj2) {
        this.f112092a = i;
        this.f112093b = comparable;
        this.f112094c = obj2;
    }

    public static b d(Context context, Uri uri2, c cVar) {
        return new b(0, uri2, new d(com.bumptech.glide.b.a(context).d.a().e(), cVar, com.bumptech.glide.b.a(context).e, context.getContentResolver()));
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // com.bumptech.glide.load.data.e
    public final java.lang.Class a() {
        /*
            r1 = this;
            int r0 = r1.f112092a
            switch(r0) {
                case 0: goto L1e;
                case 1: goto L14;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f112094c
            i8.d r0 = (i8.d) r0
            int r0 = r0.f159353a
            switch(r0) {
                case 2: goto L11;
                default: goto Le;
            }
        Le:
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            goto L13
        L11:
            java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
        L13:
            return r0
        L14:
            java.lang.Object r0 = r1.f112094c
            i8.d r0 = (i8.d) r0
            r0.getClass()
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
        L1e:
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.b.a():java.lang.Class");
    }

    @Override // com.bumptech.glide.load.data.e
    public final c8.a b() {
        switch (this.f112092a) {
        }
        return c8.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c(h hVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        Object objOpen;
        switch (this.f112092a) {
            case 0:
                try {
                    InputStream inputStreamH = h();
                    this.d = inputStreamH;
                    dVar.d(inputStreamH);
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                    }
                    dVar.e(e);
                    return;
                }
                break;
            case 1:
                try {
                    ByteArrayInputStream byteArrayInputStreamA = i8.d.a((String) this.f112093b);
                    this.d = byteArrayInputStreamA;
                    dVar.d(byteArrayInputStreamA);
                } catch (IllegalArgumentException e2) {
                    dVar.e(e2);
                }
                break;
            default:
                try {
                    i8.d dVar2 = (i8.d) this.f112094c;
                    File file = (File) this.f112093b;
                    switch (dVar2.f159353a) {
                        case 2:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.d = objOpen;
                    dVar.d(objOpen);
                } catch (FileNotFoundException e4) {
                    if (Log.isLoggable("FileLoader", 3)) {
                    }
                    dVar.e(e4);
                    return;
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i = this.f112092a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        switch (this.f112092a) {
            case 0:
                InputStream inputStream = (InputStream) this.d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            case 1:
                try {
                    ((ByteArrayInputStream) this.d).close();
                } catch (IOException unused2) {
                    return;
                }
                break;
            default:
                Object obj2 = this.d;
                if (obj2 != null) {
                    try {
                        switch (((i8.d) this.f112094c).f159353a) {
                            case 2:
                                ((ParcelFileDescriptor) obj2).close();
                                break;
                            default:
                                ((InputStream) obj2).close();
                                break;
                        }
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0028: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:10:0x0028 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.NullPointerException] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream h() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.b.h():java.io.InputStream");
    }
}
