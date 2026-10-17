package com.meshconnect.link.ui;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import cm.c;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0013\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/meshconnect/link/ui/LinkExit;", "Lcom/meshconnect/link/ui/LinkResult;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "error", "", "(Ljava/lang/Throwable;)V", "getErrorMessage", "()Ljava/lang/String;", "getError$annotations", "()V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LinkExit implements LinkResult {

    @NotNull
    public static final Parcelable.Creator<LinkExit> CREATOR = new c(7);
    private final Throwable error;
    private final String errorMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkExit() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LinkExit copy$default(LinkExit linkExit, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = linkExit.errorMessage;
        }
        return linkExit.copy(str);
    }

    @d
    public static /* synthetic */ void getError$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final LinkExit copy(String errorMessage) {
        return new LinkExit(errorMessage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LinkExit) && Intrinsics.f(this.errorMessage, ((LinkExit) other).errorMessage);
    }

    public final Throwable getError() {
        return this.error;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        String str = this.errorMessage;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return a.u(new StringBuilder("LinkExit(errorMessage="), this.errorMessage, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.errorMessage);
    }

    public LinkExit(String str) {
        this.errorMessage = str;
    }

    public /* synthetic */ LinkExit(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    @d
    public LinkExit(Throwable th10) {
        this(th10 != null ? th10.getMessage() : null);
    }
}
