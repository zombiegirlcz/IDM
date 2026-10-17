package gl3;

import android.content.ContentResolver;
import android.provider.ContactsContract;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f144537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f144538c;

    public /* synthetic */ a(f fVar, Long l2, int i) {
        this.f144536a = i;
        this.f144537b = fVar;
        this.f144538c = l2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f144536a) {
            case 0:
                ContentResolver contentResolver = this.f144537b.f144548a.getContentResolver();
                Long l2 = this.f144538c;
                return contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, l2 != null ? "contact_last_updated_timestamp > ?" : null, l2 != null ? new String[]{String.valueOf(l2.longValue())} : null, null);
            case 1:
                ContentResolver contentResolver2 = this.f144537b.f144548a.getContentResolver();
                Intrinsics.checkNotNullExpressionValue(contentResolver2, "getContentResolver(...)");
                StringBuilder sb6 = new StringBuilder("data1 LIKE '%@%'");
                Long l3 = this.f144538c;
                if (l3 != null) {
                    sb6.append(" AND contact_last_updated_timestamp > ?");
                }
                return contentResolver2.query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, f.d, sb6.toString(), l3 != null ? new String[]{String.valueOf(l3.longValue())} : null, null);
            default:
                ContentResolver contentResolver3 = this.f144537b.f144548a.getContentResolver();
                Intrinsics.checkNotNullExpressionValue(contentResolver3, "getContentResolver(...)");
                Long l4 = this.f144538c;
                return contentResolver3.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, f.f144547c, l4 != null ? "contact_last_updated_timestamp > ?" : null, l4 != null ? new String[]{String.valueOf(l4.longValue())} : null, null);
        }
    }
}
