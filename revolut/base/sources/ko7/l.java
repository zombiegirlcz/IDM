package ko7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.address.AddressPickerScreenContract$InputData;
import do3.n;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import rp0.g1;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends jki.g implements f {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f186263p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w39.b f186264q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f186265r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vn7.a f186266s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g1 f186267t;
    public final d u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, ang.f userInteractor, w39.b locationInteractor, j60.a bottomExpandableDialogExtension, vn7.a hintPopupFactory, g1 shotDialogDisplayer, AddressPickerScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogExtension, "bottomExpandableDialogExtension");
        Intrinsics.checkNotNullParameter(hintPopupFactory, "hintPopupFactory");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f186263p = userInteractor;
        this.f186264q = locationInteractor;
        this.f186265r = bottomExpandableDialogExtension;
        this.f186266s = hintPopupFactory;
        this.f186267t = shotDialogDisplayer;
        this.u = new d(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.f75546a, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(ko7.l r9, com.revolut.data.model.Data r10, gim.c r11) {
        /*
            boolean r0 = r11 instanceof ko7.k
            if (r0 == 0) goto L13
            r0 = r11
            ko7.k r0 = (ko7.k) r0
            int r1 = r0.f186262x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f186262x = r1
            goto L18
        L13:
            ko7.k r0 = new ko7.k
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f186262x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.data.model.Data r10 = r0.u
            yhm.o.b(r11)
            goto L49
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            yhm.o.b(r11)
            ka2.b0 r11 = new ka2.b0
            r2 = 19
            r11.<init>(r10, r2)
            r9.x2(r11)
            r0.u = r10
            r0.f186262x = r3
            java.lang.Object r11 = r9.z2(r10, r0)
            if (r11 != r1) goto L49
            return r1
        L49:
            jki.i r11 = r9.t2()
            ko7.d r11 = (ko7.d) r11
            com.revolut.feature.address.models.Address r11 = r11.d
            java.lang.Object r0 = r10.getContent()
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r11, r0)
            if (r11 != 0) goto L82
            java.lang.Object r10 = r10.getContent()
            if (r10 == 0) goto L82
            rp0.g1 r9 = r9.f186267t
            com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration$a r0 = com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration.INSTANCE
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r10 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_edit_application_address_changed_text
            r11 = 14
            r1 = 0
            r2.<init>(r10, r1, r1, r11)
            rp0.f1 r6 = rp0.f1.ABOVE_ANCHOR_VIEW
            r7 = 0
            r8 = 220(0xdc, float:3.08E-43)
            java.lang.String r1 = "ADDRESS_CHANGED_TOAST_ID"
            r3 = 0
            r4 = 0
            r5 = 0
            com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration r10 = com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration.Companion.b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            rp0.k1 r9 = (rp0.k1) r9
            r9.d(r10)
        L82:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ko7.l.y2(ko7.l, com.revolut.data.model.Data, gim.c):java.lang.Object");
    }

    public final void A2(boolean z) {
        yji.l.a1(this, rd0.e.b(nim.a.w(this.f186263p.k(z), new h0() { // from class: ko7.j
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((n) obj2).k;
            }
        })), null, null, new kb7.c(this, null, 27), 3);
    }

    @Override // yji.l
    public final void I1() {
        A2(false);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z2(com.revolut.data.model.Data r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ko7.i
            if (r0 == 0) goto L13
            r0 = r7
            ko7.i r0 = (ko7.i) r0
            int r1 = r0.f186260x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f186260x = r1
            goto L18
        L13:
            ko7.i r0 = new ko7.i
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f186260x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.revolut.data.model.Data r6 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L2a
            goto L5c
        L2a:
            r7 = move-exception
            goto L6e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            knd.a r7 = new knd.a
            r2 = 17
            r7.<init>(r2)
            r5.x2(r7)
            java.lang.Object r7 = r6.getContent()     // Catch: java.lang.Throwable -> L2a
            if (r7 == 0) goto L5f
            com.revolut.feature.address.models.Address r7 = (com.revolut.feature.address.models.Address) r7     // Catch: java.lang.Throwable -> L2a
            w39.b r2 = r5.f186264q     // Catch: java.lang.Throwable -> L2a
            z39.b r2 = (z39.b) r2     // Catch: java.lang.Throwable -> L2a
            rfm.w r7 = r2.d(r7)     // Catch: java.lang.Throwable -> L2a
            r0.u = r6     // Catch: java.lang.Throwable -> L2a
            r0.f186260x = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = nim.a.h(r7, r0)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r1) goto L5c
            return r1
        L5c:
            com.revolut.feature.location.api.domain.models.location.LocationDomain r7 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r7     // Catch: java.lang.Throwable -> L2a
            goto L60
        L5f:
            r7 = r4
        L60:
            java.lang.Throwable r0 = r6.getError()     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r6.getLoading()     // Catch: java.lang.Throwable -> L2a
            com.revolut.data.model.Data r2 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r7, r0, r1)     // Catch: java.lang.Throwable -> L2a
            goto L77
        L6e:
            com.revolut.data.model.Data r2 = new com.revolut.data.model.Data
            boolean r6 = r6.getLoading()
            r2.<init>(r4, r7, r6)
        L77:
            ka2.b0 r6 = new ka2.b0
            r7 = 20
            r6.<init>(r2, r7)
            r5.x2(r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ko7.l.z2(com.revolut.data.model.Data, gim.c):java.lang.Object");
    }
}
