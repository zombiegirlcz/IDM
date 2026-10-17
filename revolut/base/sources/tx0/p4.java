package tx0;

import com.revolut.feature.payments.who_to_transfer.api.common.RecipientCountryCurrencyConfig;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class p4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f275225b;

    public /* synthetic */ p4(Object obj2, int i) {
        this.f275224a = i;
        this.f275225b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0193 A[Catch: all -> 0x017d, TryCatch #1 {all -> 0x017d, blocks: (B:5:0x0018, B:6:0x0081, B:8:0x0087, B:12:0x0098, B:16:0x00a7, B:20:0x00b8, B:24:0x00cb, B:28:0x00da, B:32:0x00e9, B:36:0x00f8, B:40:0x0107, B:44:0x0123, B:48:0x0130, B:52:0x0143, B:56:0x0152, B:58:0x0158, B:60:0x015e, B:62:0x0166, B:70:0x0188, B:74:0x019b, B:78:0x01ae, B:82:0x01c1, B:85:0x01ce, B:81:0x01b9, B:77:0x01a6, B:73:0x0193, B:55:0x014c, B:51:0x013d, B:47:0x012c, B:43:0x0114, B:39:0x0101, B:35:0x00f2, B:31:0x00e3, B:27:0x00d4, B:23:0x00c5, B:19:0x00b0, B:15:0x00a1, B:11:0x0092), top: B:268:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6 A[Catch: all -> 0x017d, TryCatch #1 {all -> 0x017d, blocks: (B:5:0x0018, B:6:0x0081, B:8:0x0087, B:12:0x0098, B:16:0x00a7, B:20:0x00b8, B:24:0x00cb, B:28:0x00da, B:32:0x00e9, B:36:0x00f8, B:40:0x0107, B:44:0x0123, B:48:0x0130, B:52:0x0143, B:56:0x0152, B:58:0x0158, B:60:0x015e, B:62:0x0166, B:70:0x0188, B:74:0x019b, B:78:0x01ae, B:82:0x01c1, B:85:0x01ce, B:81:0x01b9, B:77:0x01a6, B:73:0x0193, B:55:0x014c, B:51:0x013d, B:47:0x012c, B:43:0x0114, B:39:0x0101, B:35:0x00f2, B:31:0x00e3, B:27:0x00d4, B:23:0x00c5, B:19:0x00b0, B:15:0x00a1, B:11:0x0092), top: B:268:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b9 A[Catch: all -> 0x017d, TryCatch #1 {all -> 0x017d, blocks: (B:5:0x0018, B:6:0x0081, B:8:0x0087, B:12:0x0098, B:16:0x00a7, B:20:0x00b8, B:24:0x00cb, B:28:0x00da, B:32:0x00e9, B:36:0x00f8, B:40:0x0107, B:44:0x0123, B:48:0x0130, B:52:0x0143, B:56:0x0152, B:58:0x0158, B:60:0x015e, B:62:0x0166, B:70:0x0188, B:74:0x019b, B:78:0x01ae, B:82:0x01c1, B:85:0x01ce, B:81:0x01b9, B:77:0x01a6, B:73:0x0193, B:55:0x014c, B:51:0x013d, B:47:0x012c, B:43:0x0114, B:39:0x0101, B:35:0x00f2, B:31:0x00e3, B:27:0x00d4, B:23:0x00c5, B:19:0x00b0, B:15:0x00a1, B:11:0x0092), top: B:268:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ce A[Catch: all -> 0x017d, TRY_LEAVE, TryCatch #1 {all -> 0x017d, blocks: (B:5:0x0018, B:6:0x0081, B:8:0x0087, B:12:0x0098, B:16:0x00a7, B:20:0x00b8, B:24:0x00cb, B:28:0x00da, B:32:0x00e9, B:36:0x00f8, B:40:0x0107, B:44:0x0123, B:48:0x0130, B:52:0x0143, B:56:0x0152, B:58:0x0158, B:60:0x015e, B:62:0x0166, B:70:0x0188, B:74:0x019b, B:78:0x01ae, B:82:0x01c1, B:85:0x01ce, B:81:0x01b9, B:77:0x01a6, B:73:0x0193, B:55:0x014c, B:51:0x013d, B:47:0x012c, B:43:0x0114, B:39:0x0101, B:35:0x00f2, B:31:0x00e3, B:27:0x00d4, B:23:0x00c5, B:19:0x00b0, B:15:0x00a1, B:11:0x0092), top: B:268:0x0018 }] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tx0.p4.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ p4(u3a.n nVar, RecipientCountryCurrencyConfig recipientCountryCurrencyConfig) {
        this.f275224a = 22;
        this.f275225b = recipientCountryCurrencyConfig;
    }
}
