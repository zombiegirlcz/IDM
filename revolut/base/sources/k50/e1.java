package k50;

import com.revolut.chat.data.repository.chat.MessageAuthor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e1 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageAuthor f181054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f181055b;

    public e1(MessageAuthor messageAuthor, boolean z) {
        this.f181054a = messageAuthor;
        this.f181055b = z;
    }

    @Override // k50.f1
    public final boolean a() {
        return this.f181055b;
    }

    @Override // k50.f1
    public final MessageAuthor a0() {
        return this.f181054a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f181054a, e1Var.f181054a) && this.f181055b == e1Var.f181055b;
    }

    public final int hashCode() {
        MessageAuthor messageAuthor = this.f181054a;
        return Boolean.hashCode(this.f181055b) + ((messageAuthor == null ? 0 : messageAuthor.hashCode()) * 31);
    }
}
