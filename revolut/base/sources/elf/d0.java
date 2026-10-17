package elf;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c76.a f127310a;

    public d0(c76.a modelExtension) {
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.f127310a = modelExtension;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        ChargeBreakdown chargeBreakdown = obj2 instanceof ChargeBreakdown ? (ChargeBreakdown) obj2 : null;
        if (chargeBreakdown == null) {
            return Boolean.FALSE;
        }
        this.f127310a.Z2(chargeBreakdown);
        return Boolean.TRUE;
    }
}
