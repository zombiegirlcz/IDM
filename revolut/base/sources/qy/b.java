package qy;

import a00.d;
import adh.k;
import aw0.o9;
import b00.f;
import ch.qos.logback.core.CoreConstants;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import dx.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import w00.g;
import x00.c;
import x00.e;
import xv.l;
import xv.q;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements a {
    public static String c(Class cls) {
        String name = cls.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String lowerCase = a0.D(d0.A0(CoreConstants.DOLLAR, d0.w0(CoreConstants.DOT, name, name)), "ValidationResult", "", false).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static TextClause d(q qVar) throws IOException {
        String strC = c(qVar.getClass());
        String strQ = null;
        if (qVar instanceof d) {
            Integer numE = ((d) qVar).e();
            if (numE != null) {
                strQ = String.valueOf(numE.intValue());
            }
        } else if (qVar instanceof f) {
            b00.a aVarB = ((f) qVar).b();
            if (aVarB != null) {
                strQ = e(Double.valueOf(aVarB.f11532a)) + " (" + aVarB.f11533b + ")";
            }
        } else if (qVar instanceof w00.d) {
            g position = ((w00.d) qVar).getPosition();
            if (position != null) {
                strQ = String.valueOf(position.f293605c);
            }
        } else if (qVar instanceof b10.d) {
            b10.a aVarF = ((b10.d) qVar).f();
            if (aVarF != null) {
                String strE = e(Float.valueOf(aVarF.f11698c));
                String strE2 = e(Float.valueOf(aVarF.f11696a));
                String strE3 = e(Float.valueOf(aVarF.f11697b));
                StringBuilder sbM = v0.a.m("pitch=", strE, ", roll=", strE2, ", yaw=");
                sbM.append(strE3);
                strQ = sbM.toString();
            }
        } else if (qVar instanceof x00.f) {
            x00.f fVar = (x00.f) qVar;
            if (fVar instanceof c) {
                strQ = "Failed";
            } else if (fVar instanceof x00.d) {
                strQ = "Success";
            } else {
                if (!(fVar instanceof e)) {
                    throw new NoWhenBranchMatchedException();
                }
                strQ = "Unavailable";
            }
        } else if (qVar instanceof r00.e) {
            r00.e eVar = (r00.e) qVar;
            if (eVar instanceof r00.d) {
                strQ = "All passed";
            } else {
                if (!(eVar instanceof r00.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                r00.c cVar = (r00.c) qVar;
                strQ = "Failed: Quality: " + zhm.d0.k0(cVar.f250673a, ", ", null, null, 0, null, 62) + ", Rotation: pitch=" + cVar.e + ", roll=" + cVar.f250675c + ", yaw=" + cVar.d;
            }
        } else if (qVar instanceof t00.c) {
            t00.c cVar2 = (t00.c) qVar;
            if (!cVar2.equals(t00.b.f266845a)) {
                if (!cVar2.equals(t00.a.f266844a)) {
                    throw new NoWhenBranchMatchedException();
                }
                strQ = "Failed";
            }
            strQ = "Ok";
        } else if (qVar instanceof p00.d) {
            p00.d dVar = (p00.d) qVar;
            if (dVar instanceof p00.c) {
                strQ = "Ok";
            } else {
                if (!(dVar instanceof p00.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                strQ = "Failed: " + ((p00.b) qVar).f231396b;
            }
        } else {
            if (qVar instanceof q00.c) {
                q00.c cVar3 = (q00.c) qVar;
                if (!(cVar3 instanceof q00.b)) {
                    if (!(cVar3 instanceof q00.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strQ = "Failed";
                }
            } else if (qVar instanceof j00.d) {
                j00.d dVar2 = (j00.d) qVar;
                if (!dVar2.equals(j00.c.f169901a)) {
                    if (!(dVar2 instanceof j00.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strQ = j6.a.q("Validation errors are: ", zhm.d0.k0(((j00.b) qVar).f169900a, ", ", null, null, 0, null, 62));
                }
            } else if (qVar instanceof g00.d) {
                g00.d dVar3 = (g00.d) qVar;
                if (dVar3 instanceof g00.c) {
                    g00.c cVar4 = (g00.c) qVar;
                    strQ = "Document classified " + cVar4.f139247a + ", " + cVar4.f139248b + ", " + cVar4.f139249c;
                } else {
                    if (!(dVar3 instanceof g00.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strQ = "Document classification failure " + ((g00.b) qVar).f139246a;
                }
            }
            strQ = "Ok";
        }
        if (strQ == null) {
            strQ = "UNKNOWN";
        }
        return new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(strC, ": ", strQ), (Style) new Custom(Integer.valueOf(qVar.d() ? R$attr.uikit_colorGreen : R$attr.uikit_colorRed), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
    }

    public static String e(Number number) {
        return a0.d.v(new Object[]{number}, 1, "%.2f", "format(...)");
    }

    public final Clause a(l cameraResult) {
        Intrinsics.checkNotNullParameter(cameraResult, "cameraResult");
        if (cameraResult instanceof dx.d) {
            List listP0 = zhm.d0.P0(cameraResult.a(), new k(this, 9));
            ArrayList arrayList = new ArrayList(w.t(listP0, 10));
            Iterator it8 = listP0.iterator();
            while (it8.hasNext()) {
                arrayList.add(d((q) it8.next()));
            }
            return yoj.b.m(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), arrayList);
        }
        if (!(cameraResult instanceof h)) {
            return new TextClause("Unknown detector result", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        List listP02 = zhm.d0.P0(cameraResult.a(), new k(this, 10));
        ArrayList arrayList2 = new ArrayList(w.t(listP02, 10));
        Iterator it9 = listP02.iterator();
        while (it9.hasNext()) {
            arrayList2.add(d((q) it9.next()));
        }
        return yoj.b.m(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), arrayList2);
    }

    public final Iterable b(l cameraResult) {
        g position;
        Intrinsics.checkNotNullParameter(cameraResult, "cameraResult");
        if (!(cameraResult instanceof dx.d)) {
            return f0.f322471a;
        }
        wz.a aVar = null;
        wz.a aVar2 = (cameraResult instanceof dx.c ? (dx.c) cameraResult : null) != null ? new wz.a(((dx.c) cameraResult).f120494b.f120490a.e(), -16711681) : null;
        Iterable iterableA = cameraResult.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterableA) {
            if (obj2 instanceof w00.d) {
                arrayList.add(obj2);
            }
        }
        w00.d dVar = (w00.d) zhm.d0.d0(arrayList);
        if (dVar != null && (position = dVar.getPosition()) != null) {
            aVar = new wz.a(position.f293604b, -65281);
        }
        wz.a[] elements = {aVar2, aVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
