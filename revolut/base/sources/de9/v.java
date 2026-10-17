package de9;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f113338w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, Continuation continuation) {
        super(2, continuation);
        this.f113338w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.f113338w, continuation);
        vVar.v = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        if (de9.x.z2(r0, r10) == r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            de9.x r0 = r10.f113338w
            ie9.d r1 = r0.f113343s
            vkm.z1 r2 = r0.f113345w
            java.lang.Object r3 = r10.v
            com.revolut.data.model.Data r3 = (com.revolut.data.model.Data) r3
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r10.u
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r5 == 0) goto L32
            if (r5 == r9) goto L2d
            if (r5 == r8) goto L29
            if (r5 == r7) goto L2d
            if (r5 != r6) goto L21
            yhm.o.b(r11)
            goto La9
        L21:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L29:
            yhm.o.b(r11)
            goto L7d
        L2d:
            yhm.o.b(r11)
            goto L9e
        L32:
            yhm.o.b(r11)
            java.lang.Object r11 = r3.getContent()
            oe9.e r11 = (oe9.e) r11
            oe9.c r5 = oe9.c.f224566a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r11, r5)
            if (r5 == 0) goto L50
            kotlin.Unit r11 = kotlin.Unit.f186387a
            r10.v = r3
            r10.u = r9
            java.lang.Object r11 = r2.emit(r11, r10)
            if (r11 != r4) goto L9e
            goto La8
        L50:
            oe9.b r5 = oe9.b.f224565a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r11, r5)
            if (r5 == 0) goto L8a
            com.revolut.feature.passcode.PasscodeScreenContract$InputData r11 = r0.f113340p
            boolean r11 = r11.f78622c
            if (r11 == 0) goto L7d
            r10.v = r3
            r10.u = r8
            ie9.h r1 = (ie9.h) r1
            r1.getClass()
            ie9.g r11 = new ie9.g
            r5 = 0
            r11.<init>(r1, r5, r9)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r1, r11, r10)
            if (r11 != r4) goto L78
            goto L7a
        L78:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L7a:
            if (r11 != r4) goto L7d
            goto La8
        L7d:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            r10.v = r3
            r10.u = r7
            java.lang.Object r11 = r2.emit(r11, r10)
            if (r11 != r4) goto L9e
            goto La8
        L8a:
            oe9.d r2 = oe9.d.f224567a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r11, r2)
            if (r2 == 0) goto L9a
            ie9.h r1 = (ie9.h) r1
            ue0.c r11 = r1.f160679a
            r11.clear()
            goto L9e
        L9a:
            if (r11 != 0) goto Lb5
            int r11 = jli.h.f175850a
        L9e:
            r10.v = r3
            r10.u = r6
            java.lang.Object r11 = de9.x.z2(r0, r10)
            if (r11 != r4) goto La9
        La8:
            return r4
        La9:
            dcf.g0 r11 = new dcf.g0
            r1 = 5
            r11.<init>(r3, r1)
            r0.x2(r11)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        Lb5:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: de9.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
