package fu7;

import com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet;
import du7.e;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final BottomSheet.Action a(du7.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (eVar instanceof e.c) {
            return BottomSheet.Action.Dismiss.INSTANCE;
        }
        if (eVar instanceof e.g) {
            e.g gVar = (e.g) eVar;
            return new BottomSheet.Action.Upgrade(gVar.f117656a, gVar.f117657b);
        }
        if (eVar instanceof e.C0701e) {
            return new BottomSheet.Action.LearnMore(((e.C0701e) eVar).f117652a);
        }
        if (eVar instanceof e.b) {
            return new BottomSheet.Action.Deeplink(((e.b) eVar).f117647a);
        }
        if (eVar instanceof e.d) {
            return new BottomSheet.Action.DynamicContactUrl(((e.d) eVar).f117650a);
        }
        if (eVar instanceof e.f) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final BottomSheet.Button b(du7.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        try {
            String str = iVar.f117705a;
            du7.e eVar = iVar.f117706b;
            BottomSheet.Action actionA = eVar != null ? a(eVar) : null;
            if (actionA != null) {
                return new BottomSheet.Button(str, actionA);
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet c(du7.t r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r2 = r12.f117845a
            java.lang.String r3 = r12.f117846b
            java.util.List r1 = r12.f117847c
            if (r1 != 0) goto Lf
            zhm.f0 r1 = zhm.f0.f322471a
        Lf:
            r4 = r1
            du7.l r1 = r12.d
            r5 = 0
            if (r1 == 0) goto L4b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r1 = r1.f117740a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = zhm.w.t(r1, r7)
            r6.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L45
            java.lang.Object r7 = r1.next()
            du7.o r7 = (du7.o) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$ChecklistItem r8 = new com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$ChecklistItem
            java.lang.String r7 = r7.f117790a
            r8.<init>(r7)
            r6.add(r8)
            goto L2b
        L45:
            com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$Checklist r1 = new com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$Checklist
            r1.<init>(r6)
            goto L4c
        L4b:
            r1 = r5
        L4c:
            du7.s r6 = r12.e
            if (r6 == 0) goto L75
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$Footer r7 = new com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$Footer
            java.lang.String r8 = r6.f117831a
            du7.i r9 = r6.f117833c
            du7.i r6 = r6.f117832b
            if (r6 == 0) goto L62
            com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$Button r10 = b(r6)
            goto L63
        L62:
            r10 = r5
        L63:
            if (r9 == 0) goto L6a
            com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$Button r11 = b(r9)
            goto L6b
        L6a:
            r11 = r5
        L6b:
            r7.<init>(r8, r10, r11)
            if (r8 != 0) goto L76
            if (r6 != 0) goto L76
            if (r9 == 0) goto L75
            goto L76
        L75:
            r7 = r5
        L76:
            du7.h7 r12 = r12.f
            if (r12 == 0) goto L88
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            com.revolut.feature.insurance_embedded.impl.data.model.PricingPlanBanner r5 = new com.revolut.feature.insurance_embedded.impl.data.model.PricingPlanBanner
            java.lang.String r0 = r12.f117702a
            java.util.List r6 = r12.f117703b
            java.lang.String r12 = r12.f117704c
            r5.<init>(r0, r6, r12)
        L88:
            r6 = r5
            r5 = r1
            com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet r1 = new com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fu7.a.c(du7.t):com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet");
    }
}
