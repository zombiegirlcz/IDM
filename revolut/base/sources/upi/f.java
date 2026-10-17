package upi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface f {
    static void C(f fVar, int i) {
        String str = (i & 1) != 0 ? null : "sot_documents";
        b bVar = (b) fVar;
        bVar.f282059m = (i & 2) != 0 ? null : 8432;
        bVar.f282058l = str;
        bVar.i.b(bVar.f282056h, new String[]{"android.permission.CAMERA"}, 10001);
    }

    static void z(f fVar, t80.f[] documentTypes, boolean z, int i) {
        String str = (i & 1) != 0 ? null : "sot_documents";
        Integer num = (i & 2) != 0 ? null : 8433;
        if ((i & 4) != 0) {
            documentTypes = new t80.f[]{t80.f.PDF, t80.f.JPEG, t80.f.PNG};
        }
        if ((i & 8) != 0) {
            z = false;
        }
        b bVar = (b) fVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(documentTypes, "documentTypes");
        bVar.f282059m = num;
        bVar.f282058l = str;
        bVar.f282057j.e(str, kotlin.collections.d.v0(documentTypes), z);
    }
}
