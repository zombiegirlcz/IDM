package k50;

import com.revolut.chat.data.repository.chat.MessageAuthor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d1 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageAuthor f181050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181051b;

    public d1(MessageAuthor messageAuthor, String currentStepText) {
        Intrinsics.checkNotNullParameter(currentStepText, "currentStepText");
        this.f181050a = messageAuthor;
        this.f181051b = currentStepText;
    }

    @Override // k50.f1
    public final boolean a() {
        return true;
    }

    @Override // k50.f1
    public final MessageAuthor a0() {
        return this.f181050a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f181050a, d1Var.f181050a) && Intrinsics.f(this.f181051b, d1Var.f181051b);
    }

    public final int hashCode() {
        MessageAuthor messageAuthor = this.f181050a;
        return this.f181051b.hashCode() + ((messageAuthor == null ? 0 : messageAuthor.hashCode()) * 31);
    }
}
