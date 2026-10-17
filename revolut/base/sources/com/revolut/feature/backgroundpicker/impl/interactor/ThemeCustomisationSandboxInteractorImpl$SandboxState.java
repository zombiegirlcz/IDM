package com.revolut.feature.backgroundpicker.impl.interactor;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/backgroundpicker/impl/interactor/ThemeCustomisationSandboxInteractorImpl$SandboxState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThemeCustomisationSandboxInteractorImpl$SandboxState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ThemeCustomisationSandboxInteractorImpl$SandboxState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppTheme f63797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppTheme f63798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f63799c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            AppTheme appTheme = (AppTheme) j6.a.f(parcel, "parcel", ThemeCustomisationSandboxInteractorImpl$SandboxState.class);
            AppTheme appTheme2 = (AppTheme) parcel.readParcelable(ThemeCustomisationSandboxInteractorImpl$SandboxState.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                Parcelable parcelable = parcel.readParcelable(ThemeCustomisationSandboxInteractorImpl$SandboxState.class.getClassLoader());
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                for (int i5 = 0; i5 != i3; i5++) {
                    linkedHashMap2.put(parcel.readParcelable(ThemeCustomisationSandboxInteractorImpl$SandboxState.class.getClassLoader()), parcel.readString());
                }
                linkedHashMap.put(parcelable, linkedHashMap2);
            }
            return new ThemeCustomisationSandboxInteractorImpl$SandboxState(appTheme, appTheme2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThemeCustomisationSandboxInteractorImpl$SandboxState[i];
        }
    }

    public ThemeCustomisationSandboxInteractorImpl$SandboxState(AppTheme originalAppTheme, AppTheme appTheme, Map backgrounds) {
        Intrinsics.checkNotNullParameter(originalAppTheme, "originalAppTheme");
        Intrinsics.checkNotNullParameter(appTheme, "appTheme");
        Intrinsics.checkNotNullParameter(backgrounds, "backgrounds");
        this.f63797a = originalAppTheme;
        this.f63798b = appTheme;
        this.f63799c = backgrounds;
    }

    public static ThemeCustomisationSandboxInteractorImpl$SandboxState a(ThemeCustomisationSandboxInteractorImpl$SandboxState themeCustomisationSandboxInteractorImpl$SandboxState, AppTheme originalAppTheme, AppTheme appTheme, Map backgrounds, int i) {
        if ((i & 1) != 0) {
            originalAppTheme = themeCustomisationSandboxInteractorImpl$SandboxState.f63797a;
        }
        if ((i & 2) != 0) {
            appTheme = themeCustomisationSandboxInteractorImpl$SandboxState.f63798b;
        }
        if ((i & 4) != 0) {
            backgrounds = themeCustomisationSandboxInteractorImpl$SandboxState.f63799c;
        }
        themeCustomisationSandboxInteractorImpl$SandboxState.getClass();
        Intrinsics.checkNotNullParameter(originalAppTheme, "originalAppTheme");
        Intrinsics.checkNotNullParameter(appTheme, "appTheme");
        Intrinsics.checkNotNullParameter(backgrounds, "backgrounds");
        return new ThemeCustomisationSandboxInteractorImpl$SandboxState(originalAppTheme, appTheme, backgrounds);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ThemeCustomisationSandboxInteractorImpl$SandboxState)) {
            return false;
        }
        ThemeCustomisationSandboxInteractorImpl$SandboxState themeCustomisationSandboxInteractorImpl$SandboxState = (ThemeCustomisationSandboxInteractorImpl$SandboxState) obj2;
        return Intrinsics.f(this.f63797a, themeCustomisationSandboxInteractorImpl$SandboxState.f63797a) && Intrinsics.f(this.f63798b, themeCustomisationSandboxInteractorImpl$SandboxState.f63798b) && Intrinsics.f(this.f63799c, themeCustomisationSandboxInteractorImpl$SandboxState.f63799c);
    }

    public final int hashCode() {
        return this.f63799c.hashCode() + ((this.f63798b.hashCode() + (this.f63797a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f63797a, i);
        dest.writeParcelable(this.f63798b, i);
        Iterator itZ = j6.a.z(this.f63799c, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeParcelable((Parcelable) entry.getKey(), i);
            Iterator itZ2 = j6.a.z((Map) entry.getValue(), dest);
            while (itZ2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itZ2.next();
                dest.writeParcelable((Parcelable) entry2.getKey(), i);
                dest.writeString((String) entry2.getValue());
            }
        }
    }

    public /* synthetic */ ThemeCustomisationSandboxInteractorImpl$SandboxState(AppTheme appTheme) {
        this(appTheme, appTheme, r0.g());
    }
}
