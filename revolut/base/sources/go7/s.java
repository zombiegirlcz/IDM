package go7;

import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.MtaContent;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.review.MtaReviewScreenContract$InputData;
import com.revolut.feature.insurance_common.data.model.Document;
import com.youTransactor.uCube.rpc.Constants;
import kl7.a1;
import kl7.b1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ll7.v;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MtaReviewScreenContract$InputData f145106p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ll7.m f145107q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v f145108r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ang.f f145109s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wsg.n f145110t;
    public final tl7.f u;
    public final f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(jki.p stateMapper, MtaReviewScreenContract$InputData inputData, ll7.m mtaRepository, v policyRepository, ang.f userInteractor, wsg.n walletInteractor, tl7.f bottomDialog) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mtaRepository, "mtaRepository");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.f145106p = inputData;
        this.f145107q = mtaRepository;
        this.f145108r = policyRepository;
        this.f145109s = userInteractor;
        this.f145110t = walletInteractor;
        this.u = bottomDialog;
        MtaContent mtaContent = inputData.f75539b;
        this.v = new f(mtaContent.f75244a, mtaContent.f75245b, mtaContent.f75246c, mtaContent.d, inputData.f75540c, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(go7.s r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: go7.s.y2(go7.s, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (ll7.v.b(r4, r9, r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A2(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof go7.p
            if (r0 == 0) goto L13
            r0 = r9
            go7.p r0 = (go7.p) r0
            int r1 = r0.f145104w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f145104w = r1
            goto L18
        L13:
            go7.p r0 = new go7.p
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f145104w
            com.revolut.feature.insurance_car.impl.ui.screen.mta.review.MtaReviewScreenContract$InputData r3 = r8.f145106p
            ll7.v r4 = r8.f145108r
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L41
            if (r2 == r7) goto L3d
            if (r2 == r6) goto L39
            if (r2 != r5) goto L31
            yhm.o.b(r9)
            goto L6e
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            yhm.o.b(r9)
            goto L63
        L3d:
            yhm.o.b(r9)
            goto L4d
        L41:
            yhm.o.b(r9)
            r0.f145104w = r7
            java.lang.Object r9 = ll7.v.c(r4, r0)
            if (r9 != r1) goto L4d
            goto L6d
        L4d:
            java.lang.String r9 = r3.f75538a
            r0.f145104w = r6
            r2 = r4
            ll7.e0 r2 = (ll7.e0) r2
            x4l.c r2 = r2.i
            r6 = 0
            java.lang.Object r9 = r2.d(r9, r6, r0)
            if (r9 != r1) goto L5e
            goto L60
        L5e:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L60:
            if (r9 != r1) goto L63
            goto L6d
        L63:
            java.lang.String r9 = r3.f75538a
            r0.f145104w = r5
            java.lang.Object r9 = ll7.v.b(r4, r9, r0)
            if (r9 != r1) goto L6e
        L6d:
            return r1
        L6e:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: go7.s.A2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B2(dj0.d r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof go7.r
            if (r0 == 0) goto L13
            r0 = r9
            go7.r r0 = (go7.r) r0
            int r1 = r0.f145105w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f145105w = r1
            goto L18
        L13:
            go7.r r0 = new go7.r
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f145105w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L3d
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            r0.f145105w = r3
            wsg.n r9 = r7.f145110t
            java.lang.Object r9 = hx7.i.s(r9, r8, r0)
            if (r9 != r1) goto L3d
            return r1
        L3d:
            dj0.d r9 = (dj0.d) r9
            jki.i r8 = r7.t2()
            go7.f r8 = (go7.f) r8
            kl7.a1 r8 = r8.f145091a
            int[] r0 = go7.j.f145100b
            int r8 = r8.ordinal()
            r8 = r0[r8]
            r0 = 0
            switch(r8) {
                case 1: goto L83;
                case 2: goto L81;
                case 3: goto L79;
                case 4: goto L79;
                case 5: goto L79;
                case 6: goto L81;
                case 7: goto L81;
                case 8: goto L59;
                default: goto L53;
            }
        L53:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L59:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            jki.i r9 = r7.t2()
            go7.f r9 = (go7.f) r9
            kl7.a1 r9 = r9.f145091a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected mtaType: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L79:
            int r8 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_error_insufficient_funds_description_new_car
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r8)
            goto L8a
        L81:
            r1 = r0
            goto L8a
        L83:
            int r8 = com.revolut.feature.insurance_car.impl.R$string.car_insurance_error_insufficient_funds_description_new_driver
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r8)
        L8a:
            nii.y0 r8 = vl7.a.b(r9, r1)
            kotlinx.coroutines.flow.Flow r2 = r7.X1(r8)
            g23.q r5 = new g23.q
            r8 = 22
            r5.<init>(r7, r9, r0, r8)
            r6 = 3
            r3 = 0
            r4 = 0
            r1 = r7
            yji.l.a1(r1, r2, r3, r4, r5, r6)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: go7.s.B2(dj0.d, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        if (this.f145106p.f75539b.f75244a == a1.DRIVING_LICENCE_UPDATE) {
            yji.l.a1(this, rd0.e.b(this.f145109s.k(false)), null, null, new o(this, null), 3);
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }

    public final void z2(Object obj2, String listId) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i3 = 2;
        if (!(obj2 instanceof b1)) {
            if (!(obj2 instanceof Document)) {
                if (Intrinsics.f(listId, "LEGAL_CHECK_ITEM")) {
                    x2(new gn.a(9));
                    return;
                } else {
                    int i5 = jli.h.f175850a;
                    return;
                }
            }
            rr7.c cVarA = rr7.e.a((Document) obj2);
            if (cVarA instanceof rr7.a) {
                C1(((rr7.a) cVarA).f256732a);
                return;
            } else {
                if (!(cVarA instanceof rr7.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                A1(new gm6.j(this, (rr7.b) cVarA, null, i3), new yi5.b(25));
                return;
            }
        }
        b1 b1Var = (b1) obj2;
        int[] iArr = j.f145099a;
        int i6 = iArr[b1Var.ordinal()];
        if (i6 == 1) {
            i = R$string.car_insurance_mta_review_bottom_sheet_payment_header;
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.car_insurance_mta_review_bottom_sheet_refund_header;
        }
        int i21 = i;
        int i22 = iArr[b1Var.ordinal()];
        if (i22 == 1) {
            i2 = R$string.car_insurance_mta_review_bottom_sheet_payment_text;
        } else {
            if (i22 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.car_insurance_mta_review_bottom_sheet_refund_text;
        }
        int i32 = i2;
        tl7.f.R(this.u, i21, i32, null, Integer.valueOf(R$string.car_insurance_common_gotIt), null, null, null, null, Constants.TAG_F4);
    }
}
