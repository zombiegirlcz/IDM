package com.revolut.core.ui_kit.models;

import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AvatarModel.Default f58086a;

    public h0(AvatarModel.Default avatarModel) {
        Intrinsics.checkNotNullParameter(avatarModel, "avatarModel");
        this.f58086a = avatarModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && this.f58086a.equals(((h0) obj2).f58086a);
    }

    public final int hashCode() {
        return this.f58086a.hashCode() * 31;
    }
}
