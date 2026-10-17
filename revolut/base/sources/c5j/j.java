package c5j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.common.mapper.backend_fields.input.LocaleExtraData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocaleExtraData f21569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21570c;

    public j(List backendDefinitions, LocaleExtraData localeExtraData, int i) {
        Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
        Intrinsics.checkNotNullParameter(localeExtraData, "localeExtraData");
        this.f21568a = backendDefinitions;
        this.f21569b = localeExtraData;
        this.f21570c = i;
    }

    public static j a(j jVar, ArrayList arrayList, int i, int i2) {
        List backendDefinitions = arrayList;
        if ((i2 & 1) != 0) {
            backendDefinitions = jVar.f21568a;
        }
        LocaleExtraData localeExtraData = jVar.f21569b;
        if ((i2 & 4) != 0) {
            i = jVar.f21570c;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
        Intrinsics.checkNotNullParameter(localeExtraData, "localeExtraData");
        return new j(backendDefinitions, localeExtraData, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f21568a, jVar.f21568a) && Intrinsics.f(this.f21569b, jVar.f21569b) && this.f21570c == jVar.f21570c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21570c) + ((this.f21569b.hashCode() + (this.f21568a.hashCode() * 31)) * 31);
    }
}
