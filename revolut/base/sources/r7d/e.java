package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.help_centre.impl.faq.screens.feedback.EditFaqFeedbackScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditFaqFeedbackScreenContract$InputData f252107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f252108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252109c;

    public e(l lVar, t tVar, EditFaqFeedbackScreenContract$InputData editFaqFeedbackScreenContract$InputData) {
        this.f252107a = editFaqFeedbackScreenContract$InputData;
        int i = 27;
        this.f252108b = e4m.b.b(new qy7.f(lVar, this, 1, i));
        this.f252109c = e4m.b.b(new qy7.f(lVar, this, 0, i));
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
