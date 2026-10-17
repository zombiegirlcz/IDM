package xy9;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.feature.apm.core.api.ApmToggles$PixApmMigration;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends ry9.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f8a.c f309671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s8a.l f309672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i8a.e f309673n;
    public final tca.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i8a.a f309674p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kz9.a f309675q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x2k.e f309676r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f309677s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j8a.b f309678t;
    public final f8a.b u;

    public o(f8a.c transactionsInteractor, s8a.l qrCodeInteractor, i8a.e qrDialogProvider, tca.f qrResultDataExtractor, i8a.a aliasResolveErrorDialogProvider, kz9.a chatNavigationProvider, x2k.e paymentsBankTransferNaviCommandProvider, gte.a featureToggleInteractor, j8a.b keyTypeMapper, f8a.b pixContactsInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(qrCodeInteractor, "qrCodeInteractor");
        Intrinsics.checkNotNullParameter(qrDialogProvider, "qrDialogProvider");
        Intrinsics.checkNotNullParameter(qrResultDataExtractor, "qrResultDataExtractor");
        Intrinsics.checkNotNullParameter(aliasResolveErrorDialogProvider, "aliasResolveErrorDialogProvider");
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        Intrinsics.checkNotNullParameter(paymentsBankTransferNaviCommandProvider, "paymentsBankTransferNaviCommandProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(keyTypeMapper, "keyTypeMapper");
        Intrinsics.checkNotNullParameter(pixContactsInteractor, "pixContactsInteractor");
        this.f309671l = transactionsInteractor;
        this.f309672m = qrCodeInteractor;
        this.f309673n = qrDialogProvider;
        this.o = qrResultDataExtractor;
        this.f309674p = aliasResolveErrorDialogProvider;
        this.f309675q = chatNavigationProvider;
        this.f309676r = paymentsBankTransferNaviCommandProvider;
        this.f309677s = featureToggleInteractor;
        this.f309678t = keyTypeMapper;
        this.u = pixContactsInteractor;
    }

    public static PixIdentifiedType.Valid c3(SendFromClipboardType.PixType pixType) {
        if (pixType instanceof SendFromClipboardType.PixType.Phone) {
            return new PixIdentifiedType.Valid.Phone(((SendFromClipboardType.PixType.Phone) pixType).f79707a, true);
        }
        if (pixType instanceof SendFromClipboardType.PixType.Email) {
            return new PixIdentifiedType.Valid.Email(((SendFromClipboardType.PixType.Email) pixType).f79706a);
        }
        if (pixType instanceof SendFromClipboardType.PixType.Cpf) {
            return new PixIdentifiedType.Valid.Cpf(((SendFromClipboardType.PixType.Cpf) pixType).f79705a);
        }
        if (pixType instanceof SendFromClipboardType.PixType.Cnpj) {
            return new PixIdentifiedType.Valid.Cnpj(((SendFromClipboardType.PixType.Cnpj) pixType).f79704a);
        }
        if (pixType instanceof SendFromClipboardType.PixType.PixRandomKey) {
            return new PixIdentifiedType.Valid.Random(((SendFromClipboardType.PixType.PixRandomKey) pixType).f79708a);
        }
        if (pixType instanceof SendFromClipboardType.PixType.QrCode) {
            throw new IllegalArgumentException("QR code is not a valid pix key identification type");
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ry9.b
    public final boolean Z2(SendFromClipboardType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof SendFromClipboardType.PixType)) {
            return false;
        }
        final SendFromClipboardType.PixType pixType = (SendFromClipboardType.PixType) type;
        if (pixType instanceof SendFromClipboardType.PixType.QrCode) {
            T2(new i(this, (SendFromClipboardType.PixType.QrCode) type, null), new g(1, 0, o.class, this, "showPixQrCodeErrorDialog", "showPixQrCodeErrorDialog(Ljava/lang/Throwable;)Z"));
            return true;
        }
        if (!((jte.d) this.f309677s).c(ApmToggles$PixApmMigration.f61799c)) {
            final PixIdentifiedType.Valid validC3 = c3(pixType);
            final int i = 0;
            T2(new k(this, validC3, null), new Function1(this) { // from class: xy9.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f309656b;

                {
                    this.f309656b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Throwable it8 = (Throwable) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f309656b.b3(it8, pixType, validC3);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f309656b.b3(it8, pixType, validC3);
                            break;
                    }
                    return Boolean.TRUE;
                }
            });
            return true;
        }
        final PixIdentifiedType.Valid validC32 = c3(pixType);
        ApmDescriptor apmDescriptorB = ((vca.g) this.f309678t).b(validC32);
        final int i2 = 1;
        T2(new m(this, apmDescriptorB, pixType, validC32, null), new Function1(this) { // from class: xy9.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f309656b;

            {
                this.f309656b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Throwable it8 = (Throwable) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f309656b.b3(it8, pixType, validC32);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f309656b.b3(it8, pixType, validC32);
                        break;
                }
                return Boolean.TRUE;
            }
        });
        return true;
    }

    public final void b3(Throwable th10, SendFromClipboardType.PixType pixType, PixIdentifiedType.Valid valid) {
        yji.n.l2(this, L2(((uca.c) this.f309674p).c(th10, valid)), null, new n(this, pixType, null), 3);
    }
}
