package ipa;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f167704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f167705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f167706c;
    public final boolean d;

    public m(n currentUser, String conversationTitle, ArrayList messages, boolean z) {
        Intrinsics.checkNotNullParameter(currentUser, "currentUser");
        Intrinsics.checkNotNullParameter(conversationTitle, "conversationTitle");
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.f167704a = currentUser;
        this.f167705b = conversationTitle;
        this.f167706c = messages;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f167704a.equals(mVar.f167704a) && Intrinsics.f(this.f167705b, mVar.f167705b) && this.f167706c.equals(mVar.f167706c) && this.d == mVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f167706c, p.a.c(this.f167704a.hashCode() * 31, 31, this.f167705b), 31);
    }
}
