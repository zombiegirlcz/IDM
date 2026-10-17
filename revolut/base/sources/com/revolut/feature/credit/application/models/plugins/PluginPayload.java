package com.revolut.feature.credit.application.models.plugins;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import grl.r2;
import hs3.g0;
import hs3.v;
import it3.d;
import j6.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/credit/application/models/plugins/PluginPayload;", "Landroid/os/Parcelable;", "Lhs3/g0;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PluginPayload implements Parcelable, g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f66247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f66248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EntryPointParams f66249c;
    public final boolean d;
    public final PluginLaunchInstructions e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<PluginPayload> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.credit.application.models.plugins.PluginPayload$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static PluginPayload a(d status, r2 entryPointType, wi0.b countryCode, String str, PluginLaunchInstructions pluginLaunchInstructions) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            return new PluginPayload(status, countryCode, new EntryPointParams(str, entryPointType), false, pluginLaunchInstructions);
        }

        public static /* synthetic */ PluginPayload b(Companion companion, d dVar, r2 r2Var, wi0.b bVar, String str) {
            companion.getClass();
            return a(dVar, r2Var, bVar, str, null);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PluginPayload((d) parcel.readSerializable(), (wi0.b) parcel.readSerializable(), EntryPointParams.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (PluginLaunchInstructions) parcel.readParcelable(PluginPayload.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PluginPayload[i];
        }
    }

    public PluginPayload(d status, wi0.b countryCode, EntryPointParams entryPointParams, boolean z, PluginLaunchInstructions pluginLaunchInstructions) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(entryPointParams, "entryPointParams");
        this.f66247a = status;
        this.f66248b = countryCode;
        this.f66249c = entryPointParams;
        this.d = z;
        this.e = pluginLaunchInstructions;
    }

    @Override // hs3.g0
    public final List a() {
        return this.f66247a.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PluginPayload)) {
            return false;
        }
        PluginPayload pluginPayload = (PluginPayload) obj2;
        return Intrinsics.f(this.f66247a, pluginPayload.f66247a) && Intrinsics.f(this.f66248b, pluginPayload.f66248b) && Intrinsics.f(this.f66249c, pluginPayload.f66249c) && this.d == pluginPayload.d && Intrinsics.f(this.e, pluginPayload.e);
    }

    @Override // hs3.g0
    public final v getMetadata() {
        return this.f66247a.e;
    }

    public final int hashCode() {
        int iC = a.c((this.f66249c.hashCode() + p.a.c(this.f66247a.hashCode() * 31, 31, this.f66248b.f297794a)) * 31, 31, this.d);
        PluginLaunchInstructions pluginLaunchInstructions = this.e;
        return iC + (pluginLaunchInstructions == null ? 0 : pluginLaunchInstructions.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f66247a);
        dest.writeSerializable(this.f66248b);
        this.f66249c.writeToParcel(dest, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
    }
}
