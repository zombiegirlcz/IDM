package org.ejbca.cvc;

/* JADX INFO: loaded from: classes14.dex */
public interface AuthorizationRole {
    byte getValue();

    boolean isAccreditationBodyDV();

    boolean isAuthenticationTerminal();

    boolean isCVCA();

    boolean isCertificationServiceProviderDV();

    boolean isDV();

    boolean isDomesticDV();

    boolean isForeignDV();

    boolean isIS();

    boolean isSignatureTerminal();

    String name();
}
