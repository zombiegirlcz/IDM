package com.revolut.feature.full_screen_prompt.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreenContract$InputData$Legacy;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.InternalDestination;
import d67.h;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/full_screen_prompt/FullScreenPromptScreenContract$InputData$Legacy;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "Output", "feature_full_screen_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PromptRetailBridgeDestination extends InternalDestination<FullScreenPromptScreenContract$InputData$Legacy> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PromptRetailBridgeDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FullScreenPromptScreenContract$InputData$Legacy f74516b;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination$Output;", "Landroid/os/Parcelable;", "Companion", "CloseAction", "PrimaryAction", "SecondaryAction", "Link", "ClauseClick", "a", "Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination$Output$ClauseClick;", "Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination$Output$CloseAction;", "Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination$Output$Link;", "Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination$Output$PrimaryAction;", "Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination$Output$SecondaryAction;", "feature_full_screen_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Output extends Parcelable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f74523a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination$Output$ClauseClick;", "Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination$Output;", "", "toString", "()Ljava/lang/String;", "feature_full_screen_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ClauseClick implements Output {

            @NotNull
            public static final Parcelable.Creator<ClauseClick> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74517a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f74518b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ClauseClick(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ClauseClick[i];
                }
            }

            public ClauseClick(String id10, String text) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(text, "text");
                this.f74517a = id10;
                this.f74518b = text;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ClauseClick)) {
                    return false;
                }
                ClauseClick clauseClick = (ClauseClick) obj2;
                return Intrinsics.f(this.f74517a, clauseClick.f74517a) && Intrinsics.f(this.f74518b, clauseClick.f74518b);
            }

            public final int hashCode() {
                return this.f74518b.hashCode() + (this.f74517a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74517a);
                dest.writeString(this.f74518b);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination$Output$CloseAction;", "Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination$Output;", "<init>", "()V", "feature_full_screen_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class CloseAction implements Output {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final CloseAction f74519a = new CloseAction();

            @NotNull
            public static final Parcelable.Creator<CloseAction> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CloseAction.f74519a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CloseAction[i];
                }
            }

            private CloseAction() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination$Output$Link;", "Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination$Output;", "<init>", "()V", "feature_full_screen_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Link implements Output {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Link f74520a = new Link();

            @NotNull
            public static final Parcelable.Creator<Link> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Link.f74520a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Link[i];
                }
            }

            private Link() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination$Output$PrimaryAction;", "Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination$Output;", "<init>", "()V", "feature_full_screen_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class PrimaryAction implements Output {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final PrimaryAction f74521a = new PrimaryAction();

            @NotNull
            public static final Parcelable.Creator<PrimaryAction> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PrimaryAction.f74521a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PrimaryAction[i];
                }
            }

            private PrimaryAction() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination$Output$SecondaryAction;", "Lcom/revolut/feature/full_screen_prompt/navigation/PromptRetailBridgeDestination$Output;", "<init>", "()V", "feature_full_screen_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class SecondaryAction implements Output {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SecondaryAction f74522a = new SecondaryAction();

            @NotNull
            public static final Parcelable.Creator<SecondaryAction> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SecondaryAction.f74522a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SecondaryAction[i];
                }
            }

            private SecondaryAction() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.full_screen_prompt.navigation.PromptRetailBridgeDestination$Output$a, reason: from kotlin metadata */
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ Companion f74523a = new Companion();

            private Companion() {
            }

            public static Output a(c promptOutput) {
                Intrinsics.checkNotNullParameter(promptOutput, "promptOutput");
                if (promptOutput instanceof c.a) {
                    return CloseAction.f74519a;
                }
                if (Intrinsics.f(promptOutput, c.C0497c.f74506a)) {
                    return PrimaryAction.f74521a;
                }
                if (Intrinsics.f(promptOutput, c.d.f74507a)) {
                    return SecondaryAction.f74522a;
                }
                if (Intrinsics.f(promptOutput, c.b.f74505a)) {
                    return Link.f74520a;
                }
                if (!(promptOutput instanceof h)) {
                    throw new NoWhenBranchMatchedException();
                }
                ty0.a aVar = ((h) promptOutput).f111458a;
                return new ClauseClick(aVar.f275445a, aVar.f275446b);
            }
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PromptRetailBridgeDestination(FullScreenPromptScreenContract$InputData$Legacy.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PromptRetailBridgeDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromptRetailBridgeDestination(FullScreenPromptScreenContract$InputData$Legacy input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.f74516b = input;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PromptRetailBridgeDestination) && Intrinsics.f(this.f74516b, ((PromptRetailBridgeDestination) obj2).f74516b);
    }

    public final int hashCode() {
        return this.f74516b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f74516b.writeToParcel(dest, i);
    }
}
