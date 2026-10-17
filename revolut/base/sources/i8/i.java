package i8;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159373a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f159374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f159375c;

    public i(Context context, g gVar) {
        this.f159374b = context.getApplicationContext();
        this.f159375c = gVar;
    }

    @Override // i8.u
    public final t a(Object obj2, int i, int i2, c8.k kVar) {
        switch (this.f159373a) {
            case 0:
                Integer num = (Integer) obj2;
                Resources.Theme theme = (Resources.Theme) kVar.a(n8.d.f213179b);
                return new t(new x8.e(num), new h(theme, theme != null ? theme.getResources() : this.f159374b.getResources(), (g) this.f159375c, num.intValue()));
            default:
                Uri uri2 = (Uri) obj2;
                u uVar = (u) this.f159375c;
                List<String> pathSegments = uri2.getPathSegments();
                t tVarA = null;
                if (pathSegments.size() == 1) {
                    try {
                        int i3 = Integer.parseInt(uri2.getPathSegments().get(0));
                        if (i3 != 0) {
                            tVarA = uVar.a(Integer.valueOf(i3), i, i2, kVar);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            String str = "Failed to parse a valid non-0 resource id from: " + uri2;
                        }
                        return tVarA;
                    } catch (NumberFormatException e) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return tVarA;
                        }
                        String str2 = "Failed to parse resource id from: " + uri2;
                        return tVarA;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    String str3 = "Failed to parse resource uri: " + uri2;
                    return null;
                }
                List<String> pathSegments2 = uri2.getPathSegments();
                String str4 = pathSegments2.get(0);
                String str5 = pathSegments2.get(1);
                Context context = this.f159374b;
                int identifier = context.getResources().getIdentifier(str5, str4, context.getPackageName());
                if (identifier != 0) {
                    return uVar.a(Integer.valueOf(identifier), i, i2, kVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                String str6 = "Failed to find resource id for: " + uri2;
                return null;
        }
    }

    @Override // i8.u
    public final boolean b(Object obj2) {
        switch (this.f159373a) {
            case 0:
                return true;
            default:
                Uri uri2 = (Uri) obj2;
                return "android.resource".equals(uri2.getScheme()) && this.f159374b.getPackageName().equals(uri2.getAuthority());
        }
    }

    public i(Context context, u uVar) {
        this.f159374b = context.getApplicationContext();
        this.f159375c = uVar;
    }
}
