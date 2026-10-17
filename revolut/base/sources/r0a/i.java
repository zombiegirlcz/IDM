package r0a;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f250734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatTransferRecipient f250735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f250736c;
    public final j d;
    public final qv0.i e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NavBarWithContainerBackground f250737g;

    public i(Data messages, ChatTransferRecipient recipient, g buttonsState, j jVar, qv0.i iVar, Data suggestionData, NavBarWithContainerBackground navBarWithContainerBackground) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(buttonsState, "buttonsState");
        Intrinsics.checkNotNullParameter(suggestionData, "suggestionData");
        this.f250734a = messages;
        this.f250735b = recipient;
        this.f250736c = buttonsState;
        this.d = jVar;
        this.e = iVar;
        this.f = suggestionData;
        this.f250737g = navBarWithContainerBackground;
    }

    public static i a(i iVar, Data data, ChatTransferRecipient chatTransferRecipient, g gVar, j jVar, qv0.i iVar2, Data data2, int i) {
        if ((i & 1) != 0) {
            data = iVar.f250734a;
        }
        Data messages = data;
        if ((i & 2) != 0) {
            chatTransferRecipient = iVar.f250735b;
        }
        ChatTransferRecipient recipient = chatTransferRecipient;
        if ((i & 4) != 0) {
            gVar = iVar.f250736c;
        }
        g buttonsState = gVar;
        if ((i & 8) != 0) {
            jVar = iVar.d;
        }
        j jVar2 = jVar;
        if ((i & 16) != 0) {
            iVar2 = iVar.e;
        }
        qv0.i iVar3 = iVar2;
        if ((i & 32) != 0) {
            data2 = iVar.f;
        }
        Data suggestionData = data2;
        NavBarWithContainerBackground navBarWithContainerBackground = iVar.f250737g;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(buttonsState, "buttonsState");
        Intrinsics.checkNotNullParameter(suggestionData, "suggestionData");
        return new i(messages, recipient, buttonsState, jVar2, iVar3, suggestionData, navBarWithContainerBackground);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f250734a, iVar.f250734a) && Intrinsics.f(this.f250735b, iVar.f250735b) && Intrinsics.f(this.f250736c, iVar.f250736c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f250737g, iVar.f250737g);
    }

    public final int hashCode() {
        int iHashCode = (this.f250736c.hashCode() + ((this.f250735b.hashCode() + (this.f250734a.hashCode() * 31)) * 31)) * 31;
        j jVar = this.d;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.f250738a.hashCode())) * 31;
        qv0.i iVar = this.e;
        int iC = kii.e.c(this.f, (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31, 31);
        NavBarWithContainerBackground navBarWithContainerBackground = this.f250737g;
        return iC + (navBarWithContainerBackground != null ? navBarWithContainerBackground.hashCode() : 0);
    }
}
