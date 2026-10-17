package fp1;

import android.content.Context;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oim.o;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137041a;

    public /* synthetic */ e(int i) {
        this.f137041a = i;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.f137041a) {
            case 0:
                Boolean enabled = (Boolean) obj2;
                Boolean bpay = (Boolean) obj3;
                Boolean pagoPA = (Boolean) obj4;
                Boolean f242 = (Boolean) obj5;
                Boolean phoneTopUps = (Boolean) obj6;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                Intrinsics.checkNotNullParameter(bpay, "bpay");
                Intrinsics.checkNotNullParameter(pagoPA, "pagoPA");
                Intrinsics.checkNotNullParameter(f242, "f24");
                Intrinsics.checkNotNullParameter(phoneTopUps, "phoneTopUps");
                return new vo1.b(enabled.booleanValue(), bpay.booleanValue(), pagoPA.booleanValue(), f242.booleanValue(), phoneTopUps.booleanValue());
            case 1:
                return ProcessTextApi23Impl.onClickProcessTextItem$lambda$0((Context) obj2, (ResolveInfo) obj3, ((Boolean) obj4).booleanValue(), (CharSequence) obj5, (TextRange) obj6);
            case 2:
                return ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda_129995601$lambda$0((TextContextMenuSession) obj2, (TextContextMenuDataProvider) obj3, (Function0) obj4, (Composer) obj5, ((Integer) obj6).intValue());
            case 3:
                return ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda_636288403$lambda$0((TextContextMenuSession) obj2, (TextContextMenuDataProvider) obj3, (Function0) obj4, (Composer) obj5, ((Integer) obj6).intValue());
            default:
                return ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda__1357803046$lambda$0((TextContextMenuSession) obj2, (TextContextMenuDataProvider) obj3, (Function0) obj4, (Composer) obj5, ((Integer) obj6).intValue());
        }
    }
}
