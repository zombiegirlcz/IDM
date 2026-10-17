package xo;

import com.revolut.android.bug_report.api.BugReportApi$Toggles$InAppBugReporting;
import ecm.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.j;
import sri.m;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fsi.b f307533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c5l.a f307534h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f307535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f307536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f307537c;
    public final zm0.c d;
    public final wsc.a e;
    public final bp.a f;

    static {
        fsi.b bVar = new fsi.b("ACTIVITY_DELEGATE_BUG_REPORT");
        f307533g = bVar;
        f307534h = new c5l.a(bVar);
    }

    public f(h commandProvider, q bugReportToggleProvider, m navigator, zm0.c sessionProvider, wsc.a screenshotEventSource, bp.a bugReportPromptFactory) {
        Intrinsics.checkNotNullParameter(commandProvider, "commandProvider");
        Intrinsics.checkNotNullParameter(bugReportToggleProvider, "bugReportToggleProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(screenshotEventSource, "screenshotEventSource");
        Intrinsics.checkNotNullParameter(bugReportPromptFactory, "bugReportPromptFactory");
        this.f307535a = commandProvider;
        this.f307536b = bugReportToggleProvider;
        this.f307537c = navigator;
        this.d = sessionProvider;
        this.e = screenshotEventSource;
        this.f = bugReportPromptFactory;
    }

    public final fsi.c a(j contextualPromptDialogDisplayer) {
        Intrinsics.checkNotNullParameter(contextualPromptDialogDisplayer, "contextualPromptDialogDisplayer");
        BugReportApi$Toggles$InAppBugReporting feature = BugReportApi$Toggles$InAppBugReporting.f50349c;
        Intrinsics.checkNotNullParameter(feature, "feature");
        if (!((jte.d) ((gte.a) this.f307536b.f124861b)).c(feature)) {
            return f307534h;
        }
        return new d(this.f307535a, this.f307537c, this.d, contextualPromptDialogDisplayer, this.e, this.f);
    }
}
