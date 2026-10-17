package com.onfido.workflow.internal.ui.retry;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/onfido/workflow/internal/ui/retry/RetryWorkflowViewDescriptor;", "Landroid/os/Parcelable;", "StringResIds", "Texts", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RetryWorkflowViewDescriptor implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RetryWorkflowViewDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringResIds f50203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Texts f50204b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/onfido/workflow/internal/ui/retry/RetryWorkflowViewDescriptor$StringResIds;", "Landroid/os/Parcelable;", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StringResIds implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StringResIds> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f50205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f50207c;

        public StringResIds(int i, int i2, int i3) {
            this.f50205a = i;
            this.f50206b = i2;
            this.f50207c = i3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StringResIds)) {
                return false;
            }
            StringResIds stringResIds = (StringResIds) obj2;
            return this.f50205a == stringResIds.f50205a && this.f50206b == stringResIds.f50206b && this.f50207c == stringResIds.f50207c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f50207c) + j6.a.b(this.f50206b, Integer.hashCode(this.f50205a) * 31, 31);
        }

        public final String toString() {
            return j6.a.v(com.google.android.gms.internal.mlkit_vision_face.a.w("StringResIds(title=", this.f50205a, this.f50206b, ", description=", ", button="), ")", this.f50207c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(this.f50205a);
            out.writeInt(this.f50206b);
            out.writeInt(this.f50207c);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/onfido/workflow/internal/ui/retry/RetryWorkflowViewDescriptor$Texts;", "Landroid/os/Parcelable;", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Texts implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Texts> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f50209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f50210c;

        public Texts(String title, String description, String button) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(button, "button");
            this.f50208a = title;
            this.f50209b = description;
            this.f50210c = button;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Texts)) {
                return false;
            }
            Texts texts = (Texts) obj2;
            return Intrinsics.f(this.f50208a, texts.f50208a) && Intrinsics.f(this.f50209b, texts.f50209b) && Intrinsics.f(this.f50210c, texts.f50210c);
        }

        public final int hashCode() {
            return this.f50210c.hashCode() + p.a.c(this.f50208a.hashCode() * 31, 31, this.f50209b);
        }

        public final String toString() {
            return v0.a.i(v0.a.m("Texts(title=", this.f50208a, ", description=", this.f50209b, ", button="), this.f50210c, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f50208a);
            out.writeString(this.f50209b);
            out.writeString(this.f50210c);
        }
    }

    public RetryWorkflowViewDescriptor(StringResIds stringResIds, Texts texts) {
        Intrinsics.checkNotNullParameter(stringResIds, "stringResIds");
        this.f50203a = stringResIds;
        this.f50204b = texts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RetryWorkflowViewDescriptor)) {
            return false;
        }
        RetryWorkflowViewDescriptor retryWorkflowViewDescriptor = (RetryWorkflowViewDescriptor) obj2;
        return Intrinsics.f(this.f50203a, retryWorkflowViewDescriptor.f50203a) && Intrinsics.f(this.f50204b, retryWorkflowViewDescriptor.f50204b);
    }

    public final int hashCode() {
        int iHashCode = this.f50203a.hashCode() * 31;
        Texts texts = this.f50204b;
        return iHashCode + (texts == null ? 0 : texts.hashCode());
    }

    public final String toString() {
        return "RetryWorkflowViewDescriptor(stringResIds=" + this.f50203a + ", texts=" + this.f50204b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f50203a.writeToParcel(out, i);
        Texts texts = this.f50204b;
        if (texts == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            texts.writeToParcel(out, i);
        }
    }
}
