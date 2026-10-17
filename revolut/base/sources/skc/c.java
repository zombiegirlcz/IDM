package skc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rfi_tool.api.RfiToolFlowInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RfiToolFlowInputData f263812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f263813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f263814c;

    public c(b bVar, RfiToolFlowInputData rfiToolFlowInputData) {
        this.f263812a = rfiToolFlowInputData;
        int i = 20;
        this.f263813b = e4m.b.b(new ryc.d(bVar, this, 1, i));
        this.f263814c = e4m.b.b(new ryc.d(bVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
