package awe;

import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public ArrayList u;
    public TopUpMethodsContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TopupMethod.OtherMethod f10764w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f10765x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f10766y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f10766y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f10765x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f10766y.a(null, null, this);
    }
}
