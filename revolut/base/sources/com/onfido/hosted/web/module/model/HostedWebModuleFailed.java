package com.onfido.hosted.web.module.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/onfido/hosted/web/module/model/HostedWebModuleFailed;", "Lcom/onfido/hosted/web/module/model/HostedWebModuleResult;", "body", "", "(Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class HostedWebModuleFailed implements HostedWebModuleResult {

    @NotNull
    public static final Parcelable.Creator<HostedWebModuleFailed> CREATOR = new Creator();

    @NotNull
    private final String body;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HostedWebModuleFailed> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final HostedWebModuleFailed createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HostedWebModuleFailed(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final HostedWebModuleFailed[] newArray(int i) {
            return new HostedWebModuleFailed[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HostedWebModuleFailed() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HostedWebModuleFailed copy$default(HostedWebModuleFailed hostedWebModuleFailed, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = hostedWebModuleFailed.body;
        }
        return hostedWebModuleFailed.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final HostedWebModuleFailed copy(@NotNull String body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return new HostedWebModuleFailed(body);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HostedWebModuleFailed) && Intrinsics.f(this.body, ((HostedWebModuleFailed) other).body);
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    public int hashCode() {
        return this.body.hashCode();
    }

    @NotNull
    public String toString() {
        return a.u(new StringBuilder("HostedWebModuleFailed(body="), this.body, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.body);
    }

    public HostedWebModuleFailed(@NotNull String body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.body = body;
    }

    public /* synthetic */ HostedWebModuleFailed(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
