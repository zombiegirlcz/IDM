package sil;

import com.revolut.shared.feature.workflow.engine.api.models.workflow.ProductClosurePrompt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f263657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f263658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aal.b f263659c;
    public final ProductClosurePrompt d;

    public e(String title, String subtitle, aal.b icon, ProductClosurePrompt prompt) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.f263657a = title;
        this.f263658b = subtitle;
        this.f263659c = icon;
        this.d = prompt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f263657a, eVar.f263657a) && Intrinsics.f(this.f263658b, eVar.f263658b) && this.f263659c == eVar.f263659c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f263659c.hashCode() + p.a.c(this.f263657a.hashCode() * 31, 31, this.f263658b)) * 31);
    }
}
