package com.revolut.feature.payments.recipients.settings.models;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import iy9.c;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f79684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f79685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecipientPaymentsSettings.Setting.Value.Binary f79686c;

    public b(Set recipients, c settingName, RecipientPaymentsSettings.Setting.Value.Binary value) {
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        Intrinsics.checkNotNullParameter(settingName, "settingName");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f79684a = recipients;
        this.f79685b = settingName;
        this.f79686c = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f79684a, bVar.f79684a) && this.f79685b == bVar.f79685b && this.f79686c.equals(bVar.f79686c);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79686c.f79677a) + ((this.f79685b.hashCode() + (this.f79684a.hashCode() * 31)) * 31);
    }
}
