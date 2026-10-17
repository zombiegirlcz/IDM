package com.revolut.ui_kit.card_3d_scene_proxy.errors;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/ui_kit/card_3d_scene_proxy/errors/CardSceneUnavailable;", "", "", "toString", "()Ljava/lang/String;", "ui_kit_card_3d_scene_proxy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardSceneUnavailable extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f107094a;

    public CardSceneUnavailable() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CardSceneUnavailable) && Intrinsics.f(this.f107094a, ((CardSceneUnavailable) obj2).f107094a);
    }

    public final int hashCode() {
        Exception exc2 = this.f107094a;
        if (exc2 == null) {
            return 0;
        }
        return exc2.hashCode();
    }

    public CardSceneUnavailable(Exception exc2) {
        this.f107094a = exc2;
    }
}
