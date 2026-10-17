package com.revolut.feature.transport.impl.validation;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/revolut/feature/transport/impl/validation/TicketQrCodeException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "<init>", "()V", "InvalidQR", "InvalidTicket", "NoValue", "UnsupportedResult", "Lcom/revolut/feature/transport/impl/validation/TicketQrCodeException$InvalidQR;", "Lcom/revolut/feature/transport/impl/validation/TicketQrCodeException$InvalidTicket;", "Lcom/revolut/feature/transport/impl/validation/TicketQrCodeException$NoValue;", "Lcom/revolut/feature/transport/impl/validation/TicketQrCodeException$UnsupportedResult;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TicketQrCodeException extends IllegalStateException {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/validation/TicketQrCodeException$InvalidQR;", "Lcom/revolut/feature/transport/impl/validation/TicketQrCodeException;", "", "toString", "()Ljava/lang/String;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvalidQR extends TicketQrCodeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f92588c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidQR(String str, String value) {
            super(0);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f92586a = str;
            this.f92587b = value;
            this.f92588c = d.s("TransportTicket Activation error: QR code ", value, " does not match regex ", str);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InvalidQR)) {
                return false;
            }
            InvalidQR invalidQR = (InvalidQR) obj2;
            return Intrinsics.f(this.f92586a, invalidQR.f92586a) && Intrinsics.f(this.f92587b, invalidQR.f92587b);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f92588c;
        }

        public final int hashCode() {
            String str = this.f92586a;
            return this.f92587b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/validation/TicketQrCodeException$InvalidTicket;", "Lcom/revolut/feature/transport/impl/validation/TicketQrCodeException;", "", "toString", "()Ljava/lang/String;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvalidTicket extends TicketQrCodeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92590b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidTicket(String ticketId) {
            super(0);
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            this.f92589a = ticketId;
            this.f92590b = a.p("TransportTicket Activation error: Ticket ", ticketId, " is not eligible for activation");
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvalidTicket) && Intrinsics.f(this.f92589a, ((InvalidTicket) obj2).f92589a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f92590b;
        }

        public final int hashCode() {
            return this.f92589a.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transport/impl/validation/TicketQrCodeException$NoValue;", "Lcom/revolut/feature/transport/impl/validation/TicketQrCodeException;", "<init>", "()V", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoValue extends TicketQrCodeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92591a;

        public NoValue() {
            super(0);
            this.f92591a = "TransportTicket Activation error: QR code has no value";
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f92591a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transport/impl/validation/TicketQrCodeException$UnsupportedResult;", "Lcom/revolut/feature/transport/impl/validation/TicketQrCodeException;", "<init>", "()V", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnsupportedResult extends TicketQrCodeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92592a;

        public UnsupportedResult() {
            super(0);
            this.f92592a = "TransportTicket Activation error: Unsupported QR code result";
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f92592a;
        }
    }

    public /* synthetic */ TicketQrCodeException(int i) {
        this();
    }

    private TicketQrCodeException() {
    }
}
