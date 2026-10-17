package ec4;

import android.net.Uri;
import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import pgi.l;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f124424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f124425c;

    public a(l originalModel, int i) {
        this.f124423a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(originalModel, "originalModel");
                this.f124424b = originalModel;
                break;
            default:
                Intrinsics.checkNotNullParameter(originalModel, "originalModel");
                this.f124424b = originalModel;
                break;
        }
    }

    @Override // pgi.l
    public final NaviCommand a(Uri returnUri, Uri uri2, String str) {
        switch (this.f124423a) {
            case 0:
                Intrinsics.checkNotNullParameter(returnUri, "returnUri");
                break;
            default:
                Intrinsics.checkNotNullParameter(returnUri, "returnUri");
                break;
        }
        return this.f124424b.a(returnUri, uri2, str);
    }

    @Override // pgi.l
    public final r b(WebViewContract$WebViewConfiguration config) {
        switch (this.f124423a) {
            case 0:
                Intrinsics.checkNotNullParameter(config, "config");
                if (!this.f124425c) {
                    this.f124425c = true;
                } else {
                    r rVarJust = r.just(new Data(null, null, false, 7, null));
                    Intrinsics.h(rVarJust);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(config, "config");
                if (!this.f124425c) {
                    this.f124425c = true;
                } else {
                    r rVarJust2 = r.just(new Data(null, null, false, 7, null));
                    Intrinsics.h(rVarJust2);
                }
                break;
        }
        return this.f124424b.b(config);
    }

    @Override // pgi.l
    public final void c(Parcelable parcelable) {
        switch (this.f124423a) {
            case 0:
                this.f124424b.c(parcelable);
                break;
            default:
                this.f124424b.c(parcelable);
                break;
        }
    }

    @Override // pgi.l
    public final efm.b d(Parcelable parcelable) {
        switch (this.f124423a) {
        }
        return this.f124424b.d(parcelable);
    }

    @Override // pgi.l
    public final void e(Parcelable parcelable, String deeplink) {
        switch (this.f124423a) {
            case 0:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f124424b.e(parcelable, deeplink);
                break;
            default:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f124424b.e(parcelable, deeplink);
                break;
        }
    }
}
