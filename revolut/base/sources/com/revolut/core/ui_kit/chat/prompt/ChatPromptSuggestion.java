package com.revolut.core.ui_kit.chat.prompt;

import a10.b;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p.a;
import qv0.p;
import v30.k0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/chat/prompt/ChatPromptSuggestion;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChatPromptSuggestion implements p, TrackableItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f51532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f51533c;
    public final k0 d;
    public Parcelable e;

    public ChatPromptSuggestion(String id10, Image icon, Clause text, k0 k0Var, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f51531a = id10;
        this.f51532b = icon;
        this.f51533c = text;
        this.d = k0Var;
        this.e = analyticsContext;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53876p() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChatPromptSuggestion)) {
            return false;
        }
        ChatPromptSuggestion chatPromptSuggestion = (ChatPromptSuggestion) obj2;
        return Intrinsics.f(this.f51531a, chatPromptSuggestion.f51531a) && this.f51532b.equals(chatPromptSuggestion.f51532b) && Intrinsics.f(this.f51533c, chatPromptSuggestion.f51533c) && this.d.equals(chatPromptSuggestion.d) && Intrinsics.f(this.e, chatPromptSuggestion.e);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getE() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + a.a(b.c(this.f51532b, this.f51531a.hashCode() * 31, 31), 31, this.f51533c)) * 31;
        Parcelable parcelable = this.e;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.e = parcelable;
    }
}
