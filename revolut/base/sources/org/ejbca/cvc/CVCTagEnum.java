package org.ejbca.cvc;

import com.youTransactor.uCube.rpc.Constants;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes14.dex */
public enum CVCTagEnum {
    CV_CERTIFICATE(32545, true),
    CERTIFICATE_BODY(32590, true),
    PROFILE_IDENTIFIER(24361),
    PUBLIC_KEY(32585, true),
    HOLDER_REFERENCE(Constants.EMVTag.TAG_SECURE_5F20_CARDHOLDER_NAME),
    HOLDER_AUTH_TEMPLATE(32588, true),
    EFFECTIVE_DATE(Constants.EMVTag.TAG_5F25_APPLICATION_EFFECTIVE_DATE),
    EXPIRATION_DATE(Constants.EMVTag.TAG_SECURE_5F24_APPLICATION_EXPIRATION_DATE),
    SIGNATURE(24375),
    OID(6),
    CA_REFERENCE(66),
    REQ_AUTHENTICATION(103, true),
    ROLE_AND_ACCESS_RIGHTS(83),
    MODULUS(129),
    EXPONENT(130),
    COEFFICIENT_A(130),
    COEFFICIENT_B(ISO781611.CREATION_DATE_AND_TIME_TAG),
    BASE_POINT_G(132),
    BASE_POINT_R_ORDER(133),
    PUBLIC_POINT_Y(ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA),
    COFACTOR_F(135),
    CERTIFICATE_EXTENSIONS(101, true),
    DISCRETIONARY_DATA_TEMPLATE(ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG, true),
    ARBITRARY_DATA(83);

    private boolean isSequence;
    private int value;

    CVCTagEnum(int i) {
        this(i, false);
    }

    public int getValue() {
        return this.value;
    }

    public boolean isSequence() {
        return this.isSequence;
    }

    CVCTagEnum(int i, boolean z) {
        this.value = i;
        this.isSequence = z;
    }
}
