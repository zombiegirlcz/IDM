package com.revolut.core.ui_kit.models;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f57985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f57986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f57987c;

    public a0(TextLocalisedClause textLocalisedClause, ResourceImage resourceImage, z position, int i) {
        resourceImage = (i & 2) != 0 ? null : resourceImage;
        position = (i & 8) != 0 ? z.DEFAULT : position;
        Intrinsics.checkNotNullParameter(position, "position");
        this.f57985a = textLocalisedClause;
        this.f57986b = resourceImage;
        this.f57987c = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f57985a, a0Var.f57985a) && Intrinsics.f(this.f57986b, a0Var.f57986b) && this.f57987c == a0Var.f57987c;
    }

    public final int hashCode() {
        TextLocalisedClause textLocalisedClause = this.f57985a;
        int iHashCode = (textLocalisedClause == null ? 0 : textLocalisedClause.hashCode()) * 31;
        Image image = this.f57986b;
        return this.f57987c.hashCode() + ((iHashCode + (image != null ? image.hashCode() : 0)) * 961);
    }
}
