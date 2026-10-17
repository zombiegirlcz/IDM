package com.revolut.retail.core.navigation;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.ui.login.pin.LoginScreenContract$Configuration;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/core/navigation/DeeplinkNavigateCommand;", "Lcom/revolut/retail/core/navigation/NaviCommand;", "", "toString", "()Ljava/lang/String;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class DeeplinkNavigateCommand extends NaviCommand {

    @NotNull
    public static final Parcelable.Creator<DeeplinkNavigateCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExplicitActivityDestination f98630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f98631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f98632c;
    public final String d;
    public final List e;
    public final Uri f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f98633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f98634h;

    /* JADX INFO: loaded from: classes10.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ExplicitActivityDestination explicitActivityDestinationCreateFromParcel = ExplicitActivityDestination.CREATOR.createFromParcel(parcel);
            Parcelable parcelable = parcel.readParcelable(DeeplinkNavigateCommand.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(DeeplinkNavigateCommand.class.getClassLoader()));
                }
            }
            return new DeeplinkNavigateCommand(explicitActivityDestinationCreateFromParcel, parcelable, linkedHashMap, parcel.readString(), parcel.createStringArrayList(), (Uri) parcel.readParcelable(DeeplinkNavigateCommand.class.getClassLoader()), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeeplinkNavigateCommand[i];
        }
    }

    public DeeplinkNavigateCommand(ExplicitActivityDestination destination, Parcelable parcelable, Map map, String action, List categories, Uri data, int i, String str) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f98630a = destination;
        this.f98631b = parcelable;
        this.f98632c = map;
        this.d = action;
        this.e = categories;
        this.f = data;
        this.f98633g = i;
        this.f98634h = str;
    }

    public static DeeplinkNavigateCommand a(DeeplinkNavigateCommand deeplinkNavigateCommand) {
        ExplicitActivityDestination destination = deeplinkNavigateCommand.f98630a;
        Parcelable parcelable = deeplinkNavigateCommand.f98631b;
        Map map = deeplinkNavigateCommand.f98632c;
        String action = deeplinkNavigateCommand.d;
        List categories = deeplinkNavigateCommand.e;
        Uri data = deeplinkNavigateCommand.f;
        String str = deeplinkNavigateCommand.f98634h;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(data, "data");
        return new DeeplinkNavigateCommand(destination, parcelable, map, action, categories, data, 603979776, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeeplinkNavigateCommand)) {
            return false;
        }
        DeeplinkNavigateCommand deeplinkNavigateCommand = (DeeplinkNavigateCommand) obj2;
        return Intrinsics.f(this.f98630a, deeplinkNavigateCommand.f98630a) && Intrinsics.f(this.f98631b, deeplinkNavigateCommand.f98631b) && Intrinsics.f(this.f98632c, deeplinkNavigateCommand.f98632c) && Intrinsics.f(this.d, deeplinkNavigateCommand.d) && Intrinsics.f(this.e, deeplinkNavigateCommand.e) && Intrinsics.f(this.f, deeplinkNavigateCommand.f) && this.f98633g == deeplinkNavigateCommand.f98633g && Intrinsics.f(this.f98634h, deeplinkNavigateCommand.f98634h);
    }

    public final int hashCode() {
        int iHashCode = this.f98630a.f98636a.hashCode() * 31;
        Parcelable parcelable = this.f98631b;
        int iHashCode2 = (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        Map map = this.f98632c;
        int iB = j6.a.b(this.f98633g, (this.f.hashCode() + p.a.d(p.a.c((iHashCode2 + (map == null ? 0 : map.hashCode())) * 31, 31, this.d), 31, this.e)) * 31, 31);
        String str = this.f98634h;
        return iB + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f98630a.writeToParcel(dest, i);
        dest.writeParcelable(this.f98631b, i);
        Map map = this.f98632c;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator itV = l.v(dest, 1, map);
            while (itV.hasNext()) {
                Map.Entry entry = (Map.Entry) itV.next();
                dest.writeString((String) entry.getKey());
                dest.writeValue(entry.getValue());
            }
        }
        dest.writeString(this.d);
        dest.writeStringList(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeInt(this.f98633g);
        dest.writeString(this.f98634h);
    }

    public /* synthetic */ DeeplinkNavigateCommand(ExplicitActivityDestination explicitActivityDestination, LoginScreenContract$Configuration loginScreenContract$Configuration, Map map, Uri uri2, int i) {
        this(explicitActivityDestination, (i & 2) != 0 ? null : loginScreenContract$Configuration, (i & 4) != 0 ? r0.g() : map, "android.intent.action.VIEW", v.k("android.intent.category.DEFAULT", "android.intent.category.BROWSABLE"), uri2, (i & 64) != 0 ? 0 : 335577088, null);
    }
}
