package com.revolut.feature.backgroundpicker.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.backgroundpicker.api.model.ThemeAgnosticBackgroundKey;
import em2.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailThemeAgnosticBackgroundKey;", "Lcom/revolut/feature/backgroundpicker/api/model/ThemeAgnosticBackgroundKey;", "<init>", "()V", "Chat", "Lcom/revolut/feature/backgroundpicker/models/RetailThemeAgnosticBackgroundKey$Chat;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RetailThemeAgnosticBackgroundKey extends ThemeAgnosticBackgroundKey {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailThemeAgnosticBackgroundKey$Chat;", "Lcom/revolut/feature/backgroundpicker/models/RetailThemeAgnosticBackgroundKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Chat extends RetailThemeAgnosticBackgroundKey {

        @NotNull
        public static final Parcelable.Creator<Chat> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63881a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Chat(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Chat[i];
            }
        }

        public Chat(String str) {
            this.f63881a = str;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a */
        public final String getF63853a() {
            throw null;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return j6.a.q("Chat_id_", this.f63881a);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Chat) && Intrinsics.f(this.f63881a, ((Chat) obj2).f63881a);
        }

        public final int hashCode() {
            String str = this.f63881a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63881a);
        }
    }

    private RetailThemeAgnosticBackgroundKey() {
    }

    @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
    public final k c() {
        return null;
    }
}
