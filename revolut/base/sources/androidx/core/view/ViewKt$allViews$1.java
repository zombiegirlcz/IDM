package androidx.core.view;

import android.view.View;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nkm.o;

/* JADX INFO: loaded from: classes15.dex */
@gim.d(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {WalletConstants.ERROR_CODE_INVALID_TRANSACTION, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnkm/o;", "Landroid/view/View;", "", "<anonymous>", "(Lnkm/o;)V"}, k = 3, mv = {2, 0, 0})
public final class ViewKt$allViews$1 extends gim.h implements Function2<o, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, Continuation<? super ViewKt$allViews$1> continuation) {
        super(2, continuation);
        this.$this_allViews = view;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, continuation);
        viewKt$allViews$1.L$0 = obj2;
        return viewKt$allViews$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r5 == r0) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r5)
            goto L59
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            java.lang.Object r1 = r4.L$0
            nkm.o r1 = (nkm.o) r1
            yhm.o.b(r5)
            goto L35
        L20:
            yhm.o.b(r5)
            java.lang.Object r5 = r4.L$0
            r1 = r5
            nkm.o r1 = (nkm.o) r1
            android.view.View r5 = r4.$this_allViews
            r4.L$0 = r1
            r4.label = r3
            fim.a r5 = r1.b(r5, r4)
            if (r5 != r0) goto L35
            goto L58
        L35:
            android.view.View r5 = r4.$this_allViews
            boolean r3 = r5 instanceof android.view.ViewGroup
            if (r3 == 0) goto L59
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            kotlin.sequences.Sequence r5 = androidx.core.view.ViewGroupKt.getDescendants(r5)
            r3 = 0
            r4.L$0 = r3
            r4.label = r2
            r1.getClass()
            java.util.Iterator r5 = r5.iterator()
            java.lang.Object r5 = r1.c(r5, r4)
            if (r5 != r0) goto L54
            goto L56
        L54:
            kotlin.Unit r5 = kotlin.Unit.f186387a
        L56:
            if (r5 != r0) goto L59
        L58:
            return r0
        L59:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewKt$allViews$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o oVar, Continuation<? super Unit> continuation) {
        return ((ViewKt$allViews$1) create(oVar, continuation)).invokeSuspend(Unit.f186387a);
    }
}
