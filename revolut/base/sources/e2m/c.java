package e2m;

import android.content.Context;
import com.trustdockekyc.core.backend.internal.infrastructure.api.p;
import com.trustdockekyc.core.backend.internal.infrastructure.api.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import m2m.m;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f122152h;
    public final /* synthetic */ Context i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, Context context, int i) {
        super(0);
        this.f = i;
        this.f122152h = dVar;
        this.i = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f) {
            case 0:
                return new m2m.d((p) this.f122152h.f122159l.getValue(), this.i);
            default:
                return new m((r) this.f122152h.f122161n.getValue(), this.i);
        }
    }
}
