package com.revolut.feature.payments.recipients.settings.models;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import iy9.c;
import iy9.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f79682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f79683c;
    public final RecipientPaymentsSettings.Setting.Value d;

    public a(String recipientId, d type, c settingName, RecipientPaymentsSettings.Setting.Value value) {
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(settingName, "settingName");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f79681a = recipientId;
        this.f79682b = type;
        this.f79683c = settingName;
        this.d = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f79681a, aVar.f79681a) && this.f79682b == aVar.f79682b && this.f79683c == aVar.f79683c && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f79683c.hashCode() + ((this.f79682b.hashCode() + (this.f79681a.hashCode() * 31)) * 31)) * 31);
    }
}
