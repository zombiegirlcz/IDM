package qpi;

import android.os.Bundle;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import fsi.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sri.m;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final fsi.b f248428j = new fsi.b("INITIAL_NAVI_COMMAND_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f248429h;
    public final FragmentNavigateCommand i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m navigator, FragmentNavigateCommand initialNaviCommand) {
        super(f248428j);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(initialNaviCommand, "initialNaviCommand");
        this.f248429h = navigator;
        this.i = initialNaviCommand;
    }

    @Override // fsi.a
    public final void onCreate(Bundle bundle) {
        if (bundle == null) {
            this.f248429h.c(this.i);
        }
    }
}
