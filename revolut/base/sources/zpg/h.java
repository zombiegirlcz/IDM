package zpg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;
import pcd.x;
import tof.z6;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public static ContactImage a(z6 z6Var, Map map, s sVar) {
        Object next;
        if (z6Var.c().length() > 0) {
            return new ContactImage(z6Var.f273196a, (String) null, (String) null, z6Var.f273199g, (String) null, z6Var.c(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4054);
        }
        boolean z = z6Var.k != null ? !map.containsKey(r1.f273143a) : false;
        List list = sVar.k;
        if (list != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((x) next).f234903a, z6Var.f273196a) && z) {
                    break;
                }
            }
            x xVar = (x) next;
            if (xVar != null) {
                String str = xVar.f234903a;
                Intrinsics.checkNotNullParameter(xVar, "<this>");
                return new ContactImage(str, (String) null, xVar.f234907h, (String) null, (String) null, com.google.android.gms.internal.mlkit_vision_face.a.o(xVar.d, " ", xVar.e), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4058);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit_core.displayers.image.Image b(java.util.Map r10, npg.b r11, tof.a3 r12) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zpg.h.b(java.util.Map, npg.b, tof.a3):com.revolut.core.ui_kit_core.displayers.image.Image");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit_core.displayers.image.Image c(java.util.Map r18, npg.b r19, tof.a3 r20) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zpg.h.c(java.util.Map, npg.b, tof.a3):com.revolut.core.ui_kit_core.displayers.image.Image");
    }
}
