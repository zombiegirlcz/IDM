package androidx.core.widget;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.content.pm.PackageInfoCompat;
import androidx.core.remoteviews.R$layout;
import androidx.core.widget.RemoteViewsCompat;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\b\tB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Landroidx/core/widget/RemoteViewsCompatService;", "Landroid/widget/RemoteViewsService;", "()V", "onGetViewFactory", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "intent", "Landroid/content/Intent;", "Companion", "RemoteViewsCompatServiceData", "RemoteViewsCompatServiceViewFactory", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RemoteViewsCompatService extends RemoteViewsService {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/core/widget/RemoteViewsCompatService$RemoteViewsCompatServiceData;", "", "Landroid/os/Parcel;", "parcel", "<init>", "(Landroid/os/Parcel;)V", "", "mItemsBytes", "[B", "", "mBuildVersion", "Ljava/lang/String;", "", "mAppVersion", "J", "Companion", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RemoteViewsCompatServiceData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final long mAppVersion;

        @NotNull
        private final String mBuildVersion;

        @NotNull
        private final byte[] mItemsBytes;

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u001a\u001a\u00020\u00072\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u00000\u001bH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00192\u0006\u0010\"\u001a\u00020!2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u00000\u001bH\u0000¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/core/widget/RemoteViewsCompatService$RemoteViewsCompatServiceData$Companion;", "", "<init>", "()V", "", "appWidgetId", "viewId", "", "getKey$core_remoteviews_release", "(II)Ljava/lang/String;", "getKey", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "getPrefs$core_remoteviews_release", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "getPrefs", "Landroidx/core/widget/RemoteViewsCompat$RemoteCollectionItems;", "load$core_remoteviews_release", "(Landroid/content/Context;II)Landroidx/core/widget/RemoteViewsCompat$RemoteCollectionItems;", "load", "", "getVersionCode$core_remoteviews_release", "(Landroid/content/Context;)Ljava/lang/Long;", "getVersionCode", "P", "hexString", "Lkotlin/Function1;", "Landroid/os/Parcel;", "creator", "deserializeFromHexString$core_remoteviews_release", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "deserializeFromHexString", "", "bytes", "deserializeFromBytes$core_remoteviews_release", "([BLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "deserializeFromBytes", "PREFS_FILENAME", "Ljava/lang/String;", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final <P> P deserializeFromBytes$core_remoteviews_release(@NotNull byte[] bytes, @NotNull Function1<? super Parcel, ? extends P> creator) {
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                Intrinsics.checkNotNullParameter(creator, "creator");
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                try {
                    parcelObtain.unmarshall(bytes, 0, bytes.length);
                    parcelObtain.setDataPosition(0);
                    return (P) creator.invoke(parcelObtain);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public final <P> P deserializeFromHexString$core_remoteviews_release(@NotNull String hexString, @NotNull Function1<? super Parcel, ? extends P> creator) {
                Intrinsics.checkNotNullParameter(hexString, "hexString");
                Intrinsics.checkNotNullParameter(creator, "creator");
                byte[] bArrDecode = Base64.decode(hexString, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(hexString, Base64.DEFAULT)");
                return (P) deserializeFromBytes$core_remoteviews_release(bArrDecode, creator);
            }

            @NotNull
            public final String getKey$core_remoteviews_release(int appWidgetId, int viewId) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(appWidgetId);
                sb6.append(CoreConstants.COLON_CHAR);
                sb6.append(viewId);
                return sb6.toString();
            }

            @NotNull
            public final SharedPreferences getPrefs$core_remoteviews_release(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…S_FILENAME, MODE_PRIVATE)");
                return sharedPreferences;
            }

            public final Long getVersionCode$core_remoteviews_release(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                try {
                    return Long.valueOf(PackageInfoCompat.getLongVersionCode(context.getPackageManager().getPackageInfo(context.getPackageName(), 0)));
                } catch (PackageManager.NameNotFoundException e) {
                    String str = "Couldn't retrieve version code for " + context.getPackageManager();
                    return null;
                }
            }

            public final RemoteViewsCompat.RemoteCollectionItems load$core_remoteviews_release(@NotNull Context context, int appWidgetId, int viewId) {
                Intrinsics.checkNotNullParameter(context, "context");
                String string = getPrefs$core_remoteviews_release(context).getString(getKey$core_remoteviews_release(appWidgetId, viewId), null);
                if (string == null) {
                    String str = "No collection items were stored for widget " + appWidgetId;
                    return null;
                }
                RemoteViewsCompatServiceData remoteViewsCompatServiceData = (RemoteViewsCompatServiceData) deserializeFromHexString$core_remoteviews_release(string, RemoteViewsCompatService$RemoteViewsCompatServiceData$Companion$load$data$1.INSTANCE);
                if (!Intrinsics.f(Build.VERSION.INCREMENTAL, remoteViewsCompatServiceData.mBuildVersion)) {
                    String str2 = "Android version code has changed, not using stored collection items for widget " + appWidgetId;
                    return null;
                }
                Long versionCode$core_remoteviews_release = getVersionCode$core_remoteviews_release(context);
                if (versionCode$core_remoteviews_release == null) {
                    String str3 = "Couldn't get version code, not using stored collection items for widget " + appWidgetId;
                    return null;
                }
                if (versionCode$core_remoteviews_release.longValue() != remoteViewsCompatServiceData.mAppVersion) {
                    String str4 = "App version code has changed, not using stored collection items for widget " + appWidgetId;
                    return null;
                }
                try {
                    return (RemoteViewsCompat.RemoteCollectionItems) deserializeFromBytes$core_remoteviews_release(remoteViewsCompatServiceData.mItemsBytes, RemoteViewsCompatService$RemoteViewsCompatServiceData$Companion$load$1.INSTANCE);
                } catch (Throwable th10) {
                    String str5 = "Unable to deserialize stored collection items for widget " + appWidgetId;
                    return null;
                }
            }

            private Companion() {
            }
        }

        public RemoteViewsCompatServiceData(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            byte[] bArr = new byte[parcel.readInt()];
            this.mItemsBytes = bArr;
            parcel.readByteArray(bArr);
            String string = parcel.readString();
            Intrinsics.h(string);
            this.mBuildVersion = string;
            this.mAppVersion = parcel.readLong();
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/core/widget/RemoteViewsCompatService$RemoteViewsCompatServiceViewFactory;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "mContext", "Landroid/content/Context;", "mAppWidgetId", "", "mViewId", "(Landroid/content/Context;II)V", "mItems", "Landroidx/core/widget/RemoteViewsCompat$RemoteCollectionItems;", "getCount", "getItemId", "", "position", "getLoadingView", "", "getViewAt", "Landroid/widget/RemoteViews;", "getViewTypeCount", "hasStableIds", "", "loadData", "", "onCreate", "onDataSetChanged", "onDestroy", "Companion", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RemoteViewsCompatServiceViewFactory implements RemoteViewsService.RemoteViewsFactory {

        @NotNull
        private static final RemoteViewsCompat.RemoteCollectionItems EMPTY = new RemoteViewsCompat.RemoteCollectionItems(new long[0], new RemoteViews[0], false, 1);
        private final int mAppWidgetId;

        @NotNull
        private final Context mContext;

        @NotNull
        private RemoteViewsCompat.RemoteCollectionItems mItems;
        private final int mViewId;

        public RemoteViewsCompatServiceViewFactory(@NotNull Context mContext, int i, int i2) {
            Intrinsics.checkNotNullParameter(mContext, "mContext");
            this.mContext = mContext;
            this.mAppWidgetId = i;
            this.mViewId = i2;
            this.mItems = EMPTY;
        }

        private final void loadData() {
            RemoteViewsCompat.RemoteCollectionItems remoteCollectionItemsLoad$core_remoteviews_release = RemoteViewsCompatServiceData.INSTANCE.load$core_remoteviews_release(this.mContext, this.mAppWidgetId, this.mViewId);
            if (remoteCollectionItemsLoad$core_remoteviews_release == null) {
                remoteCollectionItemsLoad$core_remoteviews_release = EMPTY;
            }
            this.mItems = remoteCollectionItemsLoad$core_remoteviews_release;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public int getCount() {
            return this.mItems.getItemCount();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public long getItemId(int position) {
            try {
                return this.mItems.getItemId(position);
            } catch (ArrayIndexOutOfBoundsException unused) {
                return -1L;
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public Void getLoadingView() {
            return null;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        @NotNull
        public RemoteViews getViewAt(int position) {
            try {
                return this.mItems.getItemView(position);
            } catch (ArrayIndexOutOfBoundsException unused) {
                return new RemoteViews(this.mContext.getPackageName(), R$layout.invalid_list_item);
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public int getViewTypeCount() {
            return this.mItems.getMViewTypeCount();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public boolean hasStableIds() {
            return this.mItems.getMHasStableIds();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onCreate() {
            loadData();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onDataSetChanged() {
            loadData();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onDestroy() {
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
            return (RemoteViews) getLoadingView();
        }
    }

    @Override // android.widget.RemoteViewsService
    @NotNull
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            throw new IllegalStateException("No app widget id was present in the intent");
        }
        int intExtra2 = intent.getIntExtra("androidx.core.widget.extra.view_id", -1);
        if (intExtra2 != -1) {
            return new RemoteViewsCompatServiceViewFactory(this, intExtra, intExtra2);
        }
        throw new IllegalStateException("No view id was present in the intent");
    }
}
