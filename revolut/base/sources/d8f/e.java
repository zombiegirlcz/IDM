package d8f;

import com.revolut.feature.wealth.models.robo.Template;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f112237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Template f112238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Template f112239c;

    public e(List templates, Template currentTemplate, Template recommendedTemplate) {
        Intrinsics.checkNotNullParameter(templates, "templates");
        Intrinsics.checkNotNullParameter(currentTemplate, "currentTemplate");
        Intrinsics.checkNotNullParameter(recommendedTemplate, "recommendedTemplate");
        this.f112237a = templates;
        this.f112238b = currentTemplate;
        this.f112239c = recommendedTemplate;
    }

    @Override // d8f.h
    public final List a() {
        return this.f112237a;
    }

    @Override // d8f.h
    public final Template b() {
        return this.f112239c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f112237a, eVar.f112237a) && Intrinsics.f(this.f112238b, eVar.f112238b) && Intrinsics.f(this.f112239c, eVar.f112239c);
    }

    public final int hashCode() {
        return this.f112239c.hashCode() + ((this.f112238b.hashCode() + (this.f112237a.hashCode() * 31)) * 31);
    }
}
