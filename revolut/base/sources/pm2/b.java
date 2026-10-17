package pm2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.backgroundpicker.api.model.BackgroundPickerFlowInput;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackgroundPickerFlowInput f237455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Optional f237456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f237457c;
    public final b d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f237458g;

    public b(c cVar, Optional optional, BackgroundPickerFlowInput backgroundPickerFlowInput) {
        this.f237457c = cVar;
        this.f237455a = backgroundPickerFlowInput;
        this.f237456b = optional;
        int i = 16;
        this.e = e4m.b.b(new pa6.f(cVar, this, 2, i));
        this.f = e4m.b.b(new pa6.f(cVar, this, 1, i));
        this.f237458g = e4m.b.b(new pa6.f(cVar, this, 0, i));
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
