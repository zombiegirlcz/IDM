package com.meshconnect.link.ui;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import cm.c;
import com.meshconnect.link.entity.LinkPayload;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/meshconnect/link/ui/LinkSuccess;", "Lcom/meshconnect/link/ui/LinkResult;", "payloads", "", "Lcom/meshconnect/link/entity/LinkPayload;", "<init>", "(Ljava/util/List;)V", "getPayloads", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LinkSuccess implements LinkResult {

    @NotNull
    public static final Parcelable.Creator<LinkSuccess> CREATOR = new c(8);

    @NotNull
    private final List<LinkPayload> payloads;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkSuccess(@NotNull List<? extends LinkPayload> payloads) {
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        this.payloads = payloads;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkSuccess copy$default(LinkSuccess linkSuccess, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = linkSuccess.payloads;
        }
        return linkSuccess.copy(list);
    }

    @NotNull
    public final List<LinkPayload> component1() {
        return this.payloads;
    }

    @NotNull
    public final LinkSuccess copy(@NotNull List<? extends LinkPayload> payloads) {
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        return new LinkSuccess(payloads);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LinkSuccess) && Intrinsics.f(this.payloads, ((LinkSuccess) other).payloads);
    }

    @NotNull
    public final List<LinkPayload> getPayloads() {
        return this.payloads;
    }

    public int hashCode() {
        return this.payloads.hashCode();
    }

    @NotNull
    public String toString() {
        return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.payloads, new StringBuilder("LinkSuccess(payloads="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = a.v(this.payloads, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), flags);
        }
    }
}
