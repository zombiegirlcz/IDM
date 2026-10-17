package com.onfido.android.sdk.capture.internal.nfc;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003Ju\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\fHÖ\u0001R\u0019\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006("}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/PassportAuthAccess;", "", "hasAccess", "", "hasPaceAuthSucceeded", "hasBacAuthSucceeded", "paceException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "bacException", "selectAppletException", "cardAccessFileString", "", "usedSecurityInfoString", "(ZZZLjava/lang/Exception;Ljava/lang/Exception;Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V", "getBacException", "()Ljava/lang/Exception;", "getCardAccessFileString", "()Ljava/lang/String;", "getHasAccess", "()Z", "getHasBacAuthSucceeded", "getHasPaceAuthSucceeded", "getPaceException", "getSelectAppletException", "getUsedSecurityInfoString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PassportAuthAccess {
    private final Exception bacException;
    private final String cardAccessFileString;
    private final boolean hasAccess;
    private final boolean hasBacAuthSucceeded;
    private final boolean hasPaceAuthSucceeded;
    private final Exception paceException;
    private final Exception selectAppletException;
    private final String usedSecurityInfoString;

    public PassportAuthAccess() {
        this(false, false, false, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ PassportAuthAccess copy$default(PassportAuthAccess passportAuthAccess, boolean z, boolean z3, boolean z4, Exception exc2, Exception exc3, Exception exc4, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = passportAuthAccess.hasAccess;
        }
        if ((i & 2) != 0) {
            z3 = passportAuthAccess.hasPaceAuthSucceeded;
        }
        if ((i & 4) != 0) {
            z4 = passportAuthAccess.hasBacAuthSucceeded;
        }
        if ((i & 8) != 0) {
            exc2 = passportAuthAccess.paceException;
        }
        if ((i & 16) != 0) {
            exc3 = passportAuthAccess.bacException;
        }
        if ((i & 32) != 0) {
            exc4 = passportAuthAccess.selectAppletException;
        }
        if ((i & 64) != 0) {
            str = passportAuthAccess.cardAccessFileString;
        }
        if ((i & 128) != 0) {
            str2 = passportAuthAccess.usedSecurityInfoString;
        }
        String str3 = str;
        String str4 = str2;
        Exception exc5 = exc3;
        Exception exc6 = exc4;
        return passportAuthAccess.copy(z, z3, z4, exc2, exc5, exc6, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasAccess() {
        return this.hasAccess;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasPaceAuthSucceeded() {
        return this.hasPaceAuthSucceeded;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasBacAuthSucceeded() {
        return this.hasBacAuthSucceeded;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Exception getPaceException() {
        return this.paceException;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Exception getBacException() {
        return this.bacException;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Exception getSelectAppletException() {
        return this.selectAppletException;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCardAccessFileString() {
        return this.cardAccessFileString;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUsedSecurityInfoString() {
        return this.usedSecurityInfoString;
    }

    @NotNull
    public final PassportAuthAccess copy(boolean hasAccess, boolean hasPaceAuthSucceeded, boolean hasBacAuthSucceeded, Exception paceException, Exception bacException, Exception selectAppletException, String cardAccessFileString, String usedSecurityInfoString) {
        return new PassportAuthAccess(hasAccess, hasPaceAuthSucceeded, hasBacAuthSucceeded, paceException, bacException, selectAppletException, cardAccessFileString, usedSecurityInfoString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportAuthAccess)) {
            return false;
        }
        PassportAuthAccess passportAuthAccess = (PassportAuthAccess) other;
        return this.hasAccess == passportAuthAccess.hasAccess && this.hasPaceAuthSucceeded == passportAuthAccess.hasPaceAuthSucceeded && this.hasBacAuthSucceeded == passportAuthAccess.hasBacAuthSucceeded && Intrinsics.f(this.paceException, passportAuthAccess.paceException) && Intrinsics.f(this.bacException, passportAuthAccess.bacException) && Intrinsics.f(this.selectAppletException, passportAuthAccess.selectAppletException) && Intrinsics.f(this.cardAccessFileString, passportAuthAccess.cardAccessFileString) && Intrinsics.f(this.usedSecurityInfoString, passportAuthAccess.usedSecurityInfoString);
    }

    public final Exception getBacException() {
        return this.bacException;
    }

    public final String getCardAccessFileString() {
        return this.cardAccessFileString;
    }

    public final boolean getHasAccess() {
        return this.hasAccess;
    }

    public final boolean getHasBacAuthSucceeded() {
        return this.hasBacAuthSucceeded;
    }

    public final boolean getHasPaceAuthSucceeded() {
        return this.hasPaceAuthSucceeded;
    }

    public final Exception getPaceException() {
        return this.paceException;
    }

    public final Exception getSelectAppletException() {
        return this.selectAppletException;
    }

    public final String getUsedSecurityInfoString() {
        return this.usedSecurityInfoString;
    }

    public int hashCode() {
        int iC = j6.a.c(j6.a.c(Boolean.hashCode(this.hasAccess) * 31, 31, this.hasPaceAuthSucceeded), 31, this.hasBacAuthSucceeded);
        Exception exc2 = this.paceException;
        int iHashCode = (iC + (exc2 == null ? 0 : exc2.hashCode())) * 31;
        Exception exc3 = this.bacException;
        int iHashCode2 = (iHashCode + (exc3 == null ? 0 : exc3.hashCode())) * 31;
        Exception exc4 = this.selectAppletException;
        int iHashCode3 = (iHashCode2 + (exc4 == null ? 0 : exc4.hashCode())) * 31;
        String str = this.cardAccessFileString;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.usedSecurityInfoString;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("PassportAuthAccess(hasAccess=");
        sb6.append(this.hasAccess);
        sb6.append(", hasPaceAuthSucceeded=");
        sb6.append(this.hasPaceAuthSucceeded);
        sb6.append(", hasBacAuthSucceeded=");
        sb6.append(this.hasBacAuthSucceeded);
        sb6.append(", paceException=");
        sb6.append(this.paceException);
        sb6.append(", bacException=");
        sb6.append(this.bacException);
        sb6.append(", selectAppletException=");
        sb6.append(this.selectAppletException);
        sb6.append(", cardAccessFileString=");
        sb6.append(this.cardAccessFileString);
        sb6.append(", usedSecurityInfoString=");
        return j6.a.u(sb6, this.usedSecurityInfoString, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public PassportAuthAccess(boolean z, boolean z3, boolean z4, Exception exc2, Exception exc3, Exception exc4, String str, String str2) {
        this.hasAccess = z;
        this.hasPaceAuthSucceeded = z3;
        this.hasBacAuthSucceeded = z4;
        this.paceException = exc2;
        this.bacException = exc3;
        this.selectAppletException = exc4;
        this.cardAccessFileString = str;
        this.usedSecurityInfoString = str2;
    }

    public /* synthetic */ PassportAuthAccess(boolean z, boolean z3, boolean z4, Exception exc2, Exception exc3, Exception exc4, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z3, (i & 4) != 0 ? false : z4, (i & 8) != 0 ? null : exc2, (i & 16) != 0 ? null : exc3, (i & 32) != 0 ? null : exc4, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : str2);
    }
}
