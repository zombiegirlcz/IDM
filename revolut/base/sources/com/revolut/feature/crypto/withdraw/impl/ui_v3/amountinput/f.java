package com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public boolean u;
    public CryptoAddress v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f71265w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public wk5.a f71266x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f71267y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Continuation continuation) {
        super(2, continuation);
        this.z = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[PHI: r4 r7 r12
      0x00aa: PHI (r4v10 boolean) = (r4v8 boolean), (r4v11 boolean) binds: [B:26:0x00a7, B:9:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r7v4 com.revolut.feature.crypto.withdraw.api.models.CryptoAddress) = 
      (r7v3 com.revolut.feature.crypto.withdraw.api.models.CryptoAddress)
      (r7v6 com.revolut.feature.crypto.withdraw.api.models.CryptoAddress)
     binds: [B:26:0x00a7, B:9:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r12v12 java.lang.Object) = (r12v11 java.lang.Object), (r12v0 java.lang.Object) binds: [B:26:0x00a7, B:9:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be A[PHI: r4 r12
      0x00be: PHI (r4v12 boolean) = (r4v10 boolean), (r4v13 boolean) binds: [B:29:0x00bb, B:8:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r12v16 java.lang.Object) = (r12v15 java.lang.Object), (r12v0 java.lang.Object) binds: [B:29:0x00bb, B:8:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
