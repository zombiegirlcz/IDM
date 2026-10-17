package n8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import c8.j;
import c8.k;
import c8.m;
import e8.e0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f213179b = new j("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, j.e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f213180a;

    public d(Context context) {
        this.f213180a = context.getApplicationContext();
    }

    @Override // c8.m
    public final boolean a(Object obj2, k kVar) {
        String scheme = ((Uri) obj2).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // c8.m
    public final /* bridge */ /* synthetic */ e0 b(Object obj2, int i, int i2, k kVar) {
        return c((Uri) obj2, kVar);
    }

    public final e0 c(Uri uri2, k kVar) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri2.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri2 + " is null or empty");
        }
        Context context = this.f213180a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(a10.b.p(uri2, "Failed to obtain context or unrecognized Uri format for: "), e);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri2.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri2.getPathSegments();
            String authority2 = uri2.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException(a10.b.p(uri2, "Failed to find resource id for: "));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(a10.b.p(uri2, "Unrecognized Uri format: "));
            }
            try {
                identifier = Integer.parseInt(uri2.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(a10.b.p(uri2, "Unrecognized Uri format: "), e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) kVar.a(f213179b) : null;
        return c.b(theme == null ? ebm.a.q(context, contextCreatePackageContext, identifier) : ebm.a.p(context, identifier, theme));
    }
}
