package iwh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_label.ui.screen.card_label_screen.CardLabelScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardLabelScreenContract$InputData f169100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f169101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f169102c;

    public f(c cVar, e eVar, CardLabelScreenContract$InputData cardLabelScreenContract$InputData) {
        this.f169100a = cardLabelScreenContract$InputData;
        int i = 9;
        this.f169101b = e4m.b.b(new iwb.b(cVar, this, 1, i));
        this.f169102c = e4m.b.b(new iwb.b(cVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
