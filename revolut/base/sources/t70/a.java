package t70;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f268384b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Resources resources, q resourceIdCache) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(resourceIdCache, "resourceIdCache");
        this.f268384b = resourceIdCache;
    }

    @Override // t70.r, android.content.res.Resources
    public final int getIdentifier(String name, String str, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!Intrinsics.f(str, c.STRING.a())) {
            return super.getIdentifier(name, str, str2);
        }
        q qVar = this.f268384b;
        Integer num = (Integer) qVar.c(name);
        if (num != null) {
            return num.intValue();
        }
        int identifier = super.getIdentifier(name, str, str2);
        qVar.d(name, Integer.valueOf(identifier));
        return identifier;
    }
}
