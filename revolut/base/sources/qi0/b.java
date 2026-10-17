package qi0;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements kh0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f246619a;

    public b(a validator) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f246619a = validator;
    }

    @Override // kh0.a
    public final String a() {
        return "com.huawei.appmarket";
    }

    @Override // kh0.a
    public final String d(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(id10, "id");
        if (((Pattern) this.f246619a.f246618a.getValue()).matcher(id10).matches()) {
            return "appmarket://details?id=".concat(id10);
        }
        throw new IllegalArgumentException(id10);
    }

    @Override // kh0.a
    public final String e(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(id10, "id");
        if (((Pattern) this.f246619a.f246618a.getValue()).matcher(id10).matches()) {
            return "https://appgallery.huawei.com/#/app/C".concat(id10);
        }
        throw new IllegalArgumentException(id10);
    }
}
