package h7a;

import android.webkit.WebView;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import ihm.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends fsi.c implements b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final fsi.b f149865p = new fsi.b("PDF_NATIVE_SAVE_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f149866h;
    public final BaseDelegatesActivity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f149867j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f149868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f149869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f149870n;
    public WebView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a configuration, BaseDelegatesActivity activity) {
        super(f149865p);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f149866h = configuration;
        this.i = activity;
        this.f149867j = p.a.D("toSerialized(...)");
        this.k = p.a.D("toSerialized(...)");
    }
}
