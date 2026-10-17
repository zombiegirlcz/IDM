package z2l;

import bj0.b;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import t70.g;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f319097a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static g f319098b;

    private a() {
    }

    public static g t() {
        g gVar = f319098b;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.r("localization");
        throw null;
    }

    @Override // t70.g
    public final String a(b gender, int i, Number quantity, Object... params) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(params, "params");
        return t().a(gender, i, quantity, Arrays.copyOf(params, params.length));
    }

    @Override // t70.g
    public final String b(String str) {
        return t().b(str);
    }

    @Override // t70.g
    public final void c() {
        t().c();
    }

    @Override // t70.g
    public final CharSequence d(b gender, int i, Number quantity) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        return t().d(gender, i, quantity);
    }

    @Override // t70.g
    public final String e(String str) {
        return t().e(str);
    }

    @Override // t70.g
    public final String f(int i, String locale, Object... params) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(params, "params");
        return t().f(i, locale, Arrays.copyOf(params, params.length));
    }

    @Override // t70.g
    public final CharSequence g(String key, Object... args) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(args, "args");
        return t().g(key, Arrays.copyOf(args, args.length));
    }

    @Override // t70.g
    public final String getString(int i) {
        return t().getString(i);
    }

    @Override // t70.g
    public final String h(int i, Number quantity, Object... params) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(params, "params");
        return t().h(i, quantity, Arrays.copyOf(params, params.length));
    }

    @Override // t70.g
    public final String i(int i, Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return t().i(i, Arrays.copyOf(params, params.length));
    }

    @Override // t70.g
    public final CharSequence j(String pluralKey, Number quantity) {
        Intrinsics.checkNotNullParameter(pluralKey, "pluralKey");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        return t().j(pluralKey, quantity);
    }

    @Override // t70.g
    public final CharSequence k(int i, Number quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        return t().k(i, quantity);
    }

    @Override // t70.g
    public final String l(String key, Object... params) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(params, "params");
        return t().l(key, Arrays.copyOf(params, params.length));
    }

    @Override // t70.g
    public final CharSequence m(b gender, String resourceKey, Number quantity) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(resourceKey, "resourceKey");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        return t().m(gender, resourceKey, quantity);
    }

    @Override // t70.g
    public final String n(b gender, String resourceKey, Object... params) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(resourceKey, "resourceKey");
        Intrinsics.checkNotNullParameter(params, "params");
        return t().n(gender, resourceKey, Arrays.copyOf(params, params.length));
    }

    @Override // t70.g
    public final String o(String pluralKey, Number quantity, Object... params) {
        Intrinsics.checkNotNullParameter(pluralKey, "pluralKey");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(params, "params");
        return t().o(pluralKey, quantity, params);
    }

    @Override // t70.g
    public final String p(b gender, String resourceKey, Number quantity, Object... params) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(resourceKey, "resourceKey");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(params, "params");
        return t().p(gender, resourceKey, quantity, Arrays.copyOf(params, params.length));
    }

    @Override // t70.g
    public final String q(b gender, int i, Object... params) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(params, "params");
        return t().q(gender, i, Arrays.copyOf(params, params.length));
    }

    @Override // t70.g
    public final String r(String key, String locale, Object... params) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(params, "params");
        return t().r(key, locale, Arrays.copyOf(params, params.length));
    }

    @Override // t70.g
    public final String s(int i, int i2, Integer quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        return t().s(i, i2, quantity);
    }
}
